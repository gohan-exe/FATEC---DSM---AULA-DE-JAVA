import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Exercicio3 extends JFrame {
    private JTextField numeroField;
    private JButton adicionarButton, calcularMediaButton;
    private ArrayList<Integer> numeros;

    public Exercicio3() {
        setTitle("Calculadora de Média");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Número:"));
        numeroField = new JTextField();
        panel.add(numeroField);

        adicionarButton = new JButton("Adicionar Número");
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarNumero();
            }
        });
        panel.add(adicionarButton);

        calcularMediaButton = new JButton("Calcular Média");
        calcularMediaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularMedia();
            }
        });
        panel.add(calcularMediaButton);

        add(panel);

        numeros = new ArrayList<>();

        setVisible(true);
    }

    private void adicionarNumero() {
        String numeroTexto = numeroField.getText();

        try {
            int numero = Integer.parseInt(numeroTexto);
            numeros.add(numero);

            numeroField.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calcularMedia() {
        try {
            double media = CalculadoraNumeros.calcularMedia(numeros);

            JOptionPane.showMessageDialog(this, "Média: " + media, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, "Não é possível calcular a média de uma lista vazia.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Exercicio3();
            }
        });
    }
}

class CalculadoraNumeros {
    public static double calcularMedia(ArrayList<Integer> numeros) {
        if (numeros.isEmpty()) {
            throw new ArithmeticException("Não é possível calcular a média de uma lista vazia.");
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        return (double) soma / numeros.size();
    }
}
