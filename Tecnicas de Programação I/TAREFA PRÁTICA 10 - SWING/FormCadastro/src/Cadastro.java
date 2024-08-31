import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Cadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_nome;
	private JTextField textField_Idade;
	private JTextField textField_Email;
	private JTextField textField_Telefone;
	private JTextField textField_CPF;
	private JTextField textField_DataNascimento;
	private JTextField Informacoes_Pessoais;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Nome_label = new JLabel("Nome:");
		Nome_label.setBounds(94, 14, 46, 14);
		contentPane.add(Nome_label);
		
		textField_nome = new JTextField();
		textField_nome.setBounds(145, 11, 141, 20);
		contentPane.add(textField_nome);
		textField_nome.setColumns(10);
		
		JRadioButton generoRadioButton = new JRadioButton("Masculino");
		generoRadioButton.setActionCommand("Feminino");

		ButtonGroup grupoGenero = new ButtonGroup();
		JRadioButton generoMasculino = new JRadioButton("Masculino");
		generoMasculino.setActionCommand("Masculino");

		JRadioButton generoFeminino = new JRadioButton("Feminino");
		generoFeminino.setActionCommand("Feminino");

		grupoGenero.add(generoMasculino);
		grupoGenero.add(generoFeminino);

		JButton Enviar_Label = new JButton("Enviar");
		Enviar_Label.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            String nome = textField_nome.getText();
		            
		            String idadeTexto = textField_Idade.getText();
		            int idade = Integer.parseInt(idadeTexto);
		            
		            boolean isMasculino = generoMasculino.isSelected();
		            
		            String email = textField_Email.getText();
		            
		            String telefoneTexto = textField_Telefone.getText();
		            int telefone = Integer.parseInt(telefoneTexto);
		            
		            String CPF = textField_CPF.getText();
		            
		            String dataNascimentoTexto = textField_DataNascimento.getText();
		            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		            LocalDate dataNascimento = LocalDate.parse(dataNascimentoTexto, formatter);
		            
		            String informacoes = "Nome: " + nome + "\n" +
		                                 "Idade: " + idade + "\n" +
		                                 "Sexo: " + (isMasculino ? "Masculino" : "Feminino") + "\n" +
		                                 "Email: " + email + "\n" +
		                                 "Telefone: " + telefone + "\n" +
		                                 "CPF: " + CPF + "\n" +
		                                 "Data de Nascimento: " + formatter.format(dataNascimento);
		            
		            Informacoes_Pessoais.setText(informacoes);
		        } catch (NumberFormatException ex) {
		            System.err.println("Erro: O texto de algum campo não é um número válido.");
		        } catch (DateTimeParseException ex) {
		            System.err.println("Erro ao processar a data de nascimento: " + ex.getMessage());
		        }
		    }
		});

		Enviar_Label.setBounds(145, 235, 141, 39);
		contentPane.add(Enviar_Label);
		
		JLabel Idade_label = new JLabel("Idade:");
		Idade_label.setBounds(94, 42, 53, 14);
		contentPane.add(Idade_label);
		
		JLabel Sexo_label = new JLabel("Sexo:");
		Sexo_label.setBounds(94, 73, 46, 14);
		contentPane.add(Sexo_label);
		
		JLabel Email_label = new JLabel("E-mail:");
		Email_label.setBounds(94, 104, 53, 14);
		contentPane.add(Email_label);
		
		JLabel Telefone_label = new JLabel("Telefone:");
		Telefone_label.setBounds(75, 135, 65, 14);
		contentPane.add(Telefone_label);
		
		JLabel CPF_Label = new JLabel("CPF:");
		CPF_Label.setBounds(94, 168, 53, 14);
		contentPane.add(CPF_Label);
		
		JLabel DataNascimento_label = new JLabel("Data de Nascimento:");
		DataNascimento_label.setBounds(26, 202, 137, 14);
		contentPane.add(DataNascimento_label);
		
		textField_Idade = new JTextField();
		textField_Idade.setBounds(145, 39, 141, 20);
		contentPane.add(textField_Idade);
		textField_Idade.setColumns(10);
		
		textField_Email = new JTextField();
		textField_Email.setBounds(145, 101, 141, 20);
		contentPane.add(textField_Email);
		textField_Email.setColumns(10);
		
		textField_Telefone = new JTextField();
		textField_Telefone.setBounds(145, 132, 141, 20);
		contentPane.add(textField_Telefone);
		textField_Telefone.setColumns(10);
		
		textField_CPF = new JTextField();
		textField_CPF.setBounds(145, 165, 141, 20);
		contentPane.add(textField_CPF);
		textField_CPF.setColumns(10);
		
		textField_DataNascimento = new JTextField();
		textField_DataNascimento.setBounds(145, 199, 141, 20);
		contentPane.add(textField_DataNascimento);
		textField_DataNascimento.setColumns(10);
		
		JRadioButton Sexo_Masculino = new JRadioButton("Masculino");
		Sexo_Masculino.setBounds(145, 69, 95, 23);
		contentPane.add(Sexo_Masculino);
		
		JRadioButton Sexo_Feminino = new JRadioButton("Feminino");
		Sexo_Feminino.setBounds(242, 69, 105, 23);
		contentPane.add(Sexo_Feminino);
		
		Informacoes_Pessoais = new JTextField();
		Informacoes_Pessoais.setBounds(103, 280, 238, 131);
		contentPane.add(Informacoes_Pessoais);
		Informacoes_Pessoais.setColumns(10);
		
	}
}
