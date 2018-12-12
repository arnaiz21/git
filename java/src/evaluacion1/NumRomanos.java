package evaluacion1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NumRomanos extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7522682394970992511L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_1;
	
	int X=0;
	int ehunekoa=0;
	int hamarrekoa=0;
	int batekoa=0;
	String emaitza=" ";
	char k1='C';
	char k5='D';
	char k10='M';
	int tratatzekoa=0;
	int aux=0;
	int Kont=1;
	int Kont1=0;
	String Num;

	int plus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumRomanos frame = new NumRomanos();
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
	public NumRomanos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(129, 135, 447, 69);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Sartu zenbaki bat erromatarrera pasatzeko ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblNewLabel.setBounds(60, 35, 634, 69);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("Pasatu");
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 31));
		btnNewButton.setBounds(262, 215, 148, 52);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 31));
		lblNewLabel_1.setBounds(213, 283, 325, 80);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Erantzuna =");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 31));
		lblNewLabel_2.setBounds(54, 293, 177, 70);
		contentPane.add(lblNewLabel_2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object Boton = e.getSource();
		if (Boton == btnNewButton) {
			Num = textField.getText();
			X = Integer.parseInt(Num);
			ehunekoa=X/100;
			aux=X%100;
			batekoa=aux%10;
			hamarrekoa=aux/10;
			tratatzekoa=ehunekoa;
			for (Kont=1; Kont<=3; Kont++) {
				if(tratatzekoa !=9) {
					if(tratatzekoa!=4) {
						if(tratatzekoa >=5) {
							emaitza=emaitza + k5;
							tratatzekoa=tratatzekoa-5;
						}
						for (Kont1=1; Kont1<=tratatzekoa; Kont1++)
						{
							emaitza= emaitza + k1;
						}
					}
					else {
						emaitza= emaitza + k1 + k5;
						}
				}
				else {
					emaitza= emaitza + k1 +k10;
						}	
				if(Kont==1) {
					k1='X';
					k5='L';
					k10='C';
					tratatzekoa=hamarrekoa;
				}
				else {
					k1='I';
					k5='V';
					k10='X';
					tratatzekoa=batekoa;
				}
				
			}
		}
		lblNewLabel_1.setText(emaitza);
		System.out.printf ("emaitza %s da", emaitza);
	}

}
