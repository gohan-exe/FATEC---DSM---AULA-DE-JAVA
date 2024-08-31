import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Exercicio2 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nomeField, precoField;
    private JButton cadastrarButton, exibirButton;
    private ArrayList<Produto> listaProdutos;

    public Exercicio2() {
        setTitle("Cadastro de Produto");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Nome do Produto:"));
        nomeField = new JTextField();
        panel.add(nomeField);

        panel.add(new JLabel("Preço:"));
        precoField = new JTextField();
        panel.add(precoField);

        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarProduto();
            }
        });
        panel.add(cadastrarButton);

        exibirButton = new JButton("Exibir Nomes");
        exibirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibirNomesProdutos();
            }
        });
        panel.add(exibirButton);

        add(panel);

        listaProdutos = new ArrayList<>();

        setVisible(true);
    }

    private void cadastrarProduto() {
        String nome = nomeField.getText();
        double preco = Double.parseDouble(precoField.getText());

        Produto produto = new Produto(nome, preco);
        listaProdutos.add(produto);

        nomeField.setText("");
        precoField.setText("");
    }

    private void exibirNomesProdutos() {
        StringBuilder nomes = new StringBuilder("Nomes dos Produtos:\n");
        listaProdutos.forEach(produto -> nomes.append(produto.getNome()).append("\n"));

        JOptionPane.showMessageDialog(this, nomes.toString(), "Nomes dos Produtos", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Exercicio2();
            }
        });
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
}
