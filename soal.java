package latihan;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class soal extends JFrame {

	private JPanel contentPane;
	private JTextField Angka1;
	private JTextField Angka2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					soal frame = new soal();
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
	public soal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAngka = new JLabel("Angka :");
		lblAngka.setBounds(32, 27, 46, 14);
		contentPane.add(lblAngka);
		
		Angka1 = new JTextField();
		Angka1.setBounds(32, 52, 86, 20);
		contentPane.add(Angka1);
		Angka1.setColumns(10);
		
		JLabel lblAngka_1 = new JLabel("Angka :");
		lblAngka_1.setBounds(32, 83, 46, 14);
		contentPane.add(lblAngka_1);
		
		Angka2 = new JTextField();
		Angka2.setBounds(32, 108, 86, 20);
		contentPane.add(Angka2);
		Angka2.setColumns(10);
		
		JRadioButton rdbtnTambah = new JRadioButton("Tambah");
		rdbtnTambah.setBounds(32, 147, 109, 23);
		contentPane.add(rdbtnTambah);
		
		JRadioButton rdbtnKurang = new JRadioButton("Kurang");
		rdbtnKurang.setBounds(143, 147, 109, 23);
		contentPane.add(rdbtnKurang);
		
		JRadioButton rdbtnKali = new JRadioButton("Kali");
		rdbtnKali.setBounds(32, 185, 109, 23);
		contentPane.add(rdbtnKali);
		
		JRadioButton rdbtnBagi = new JRadioButton("Bagi");
		rdbtnBagi.setBounds(143, 185, 109, 23);
		contentPane.add(rdbtnBagi);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String angka11 = Angka1.getText();
				String angka22 = Angka2.getText();
				int angka111 = Integer.parseInt(angka11);
				int angka222 = Integer.parseInt(angka22);
				int nilai;
				String keterangan;
			
				
				if (rdbtnTambah.isSelected()){
					nilai = angka111 + angka222;
					keterangan = "Tambah";
				}else if (rdbtnKurang.isSelected()){
					nilai = angka111 - angka222;
					keterangan = "Kurang";
				}else if(rdbtnKali.isSelected()){
					nilai = angka111 * angka222;
					keterangan = "Kali";
				}else{
					nilai = angka111 / angka222;
					keterangan = "Bagi";
				}
				JOptionPane.showMessageDialog(null, angka11 + " " + keterangan + " " + angka22 + " = " + nilai);
				
			}
			
			
			
		});
		btnSubmit.setBounds(32, 216, 89, 23);
		contentPane.add(btnSubmit);
	}
}
