import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField TFnome;
	private JTextField TFcpf;
	private JTextField TFuf;
	private JTextField TFrenda;
	private JLabel lblNewLabel_4;
	private JTextField TFconsulta;
	private JButton btnNewButton_1;
	private Contribuinte[] contribuintes = new Contribuinte[100];
	private int indice;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 526, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do contribuinte:");
		lblNewLabel.setBounds(10, 0, 731, 47);
		frame.getContentPane().add(lblNewLabel);
		
		TFnome = new JTextField();
		TFnome.setBounds(143, 13, 86, 20);
		frame.getContentPane().add(TFnome);
		TFnome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(10, 47, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		TFcpf = new JTextField();
		TFcpf.setBounds(143, 44, 86, 20);
		frame.getContentPane().add(TFcpf);
		TFcpf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("UF:");
		lblNewLabel_2.setBounds(10, 83, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		TFuf = new JTextField();
		TFuf.setBounds(143, 80, 86, 20);
		frame.getContentPane().add(TFuf);
		TFuf.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Renda anual:");
		lblNewLabel_3.setBounds(10, 122, 93, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		TFrenda = new JTextField();
		TFrenda.setBounds(143, 119, 86, 20);
		frame.getContentPane().add(TFrenda);
		TFrenda.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contribuinte contrib;
				contrib = new Contribuinte();
				contrib.setNome(TFnome.getText());
				contrib.setCpf(TFcpf.getText());
				contrib.setUf(TFuf.getText());
				contrib.setRendaAnual(Double.parseDouble(TFrenda.getText()));
				double imposto = contrib.calcularImposto();
				String str = "O contribuinte " + contrib.getNome() + " pagará " + imposto;
				JOptionPane.showMessageDialog(frame, str);
				contribuintes[indice] = contrib;
				indice++;
				
				
			}
		});
		btnNewButton.setBounds(126, 163, 135, 23);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_4 = new JLabel("Valor da consulta:");
		lblNewLabel_4.setBounds(10, 214, 110, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		TFconsulta = new JTextField();
		TFconsulta.setBounds(143, 211, 86, 20);
		frame.getContentPane().add(TFconsulta);
		TFconsulta.setColumns(10);
		
		btnNewButton_1 = new JButton("Consultar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valorConsulta = Double.parseDouble(TFconsulta.getText());
				String str = "Contribuintes com imposto acima de R$" + valorConsulta+"\n";
				for (int i=0; i<indice; i++){
					if(contribuintes[i].calcularImposto() > valorConsulta) {
						str += "\n" + contribuintes[i].getNome()+ " - "
						+contribuintes[i].getCpf()+" - "
						+contribuintes[i].getRendaAnual()+" - Imposto= "
						+contribuintes[i].calcularImposto();
						}
				}
				JOptionPane.showMessageDialog(frame, str);
			}
		});
		btnNewButton_1.setBounds(126, 255, 123, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
