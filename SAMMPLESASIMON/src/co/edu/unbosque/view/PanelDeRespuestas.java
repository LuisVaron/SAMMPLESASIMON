package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class PanelDeRespuestas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel Simon;
	private JTextField N1;
	private JTextField N2;
	private JTextField N3;
	private JTextField N4;
	private JButton boton_iniciar;
	private JButton boton_terminar;

	public PanelDeRespuestas() {

		setLayout(null);

		inicializarComponentes();

		setVisible(true);

	}

	public void inicializarComponentes() {

		Simon = new JLabel("Número: ");
		Simon.setFont(new Font("Arial",Font.BOLD,13));
		Simon.setForeground(Color.WHITE);
		Simon.setBounds(0, 30, 70, 20);
		add(Simon);

		N1 = new JTextField();
		N1.setBounds(55, 20, 35, 35);
		N1.setEditable(false);
		add(N1);

		N2 = new JTextField();
		N2.setBounds(95, 20, 35, 35);
		N2.setEditable(false);
		add(N2);

		N3 = new JTextField();
		N3.setBounds(135, 20, 35, 35);
		N3.setEditable(false);
		add(N3);

		N4 = new JTextField();
		N4.setBounds(175, 20, 35, 35);
		N4.setEditable(false);
		add(N4);

		boton_iniciar = new JButton("Iniciar");
		boton_iniciar.setBounds(220, 10, 100, 50);
		boton_iniciar.setActionCommand("INICIAR");
		boton_iniciar.addActionListener(event -> {
			Timer timer = new Timer(1000, e -> {
				N1.setText("");
				N2.setText("");
				N3.setText("");
				N4.setText("");
			});
			timer.setRepeats(false);
			timer.start();
		});
		add(boton_iniciar);



		boton_terminar = new JButton("Terminar");
		boton_terminar.setBounds(330, 10, 100, 50);
		boton_terminar.setActionCommand("TERMINAR");
		add(boton_terminar);
	}

	public JLabel getSimon() {
		return Simon;
	}

	public void setSimon(JLabel simon) {
		Simon = simon;
	}

	public JTextField getN1() {
		return N1;
	}

	public void setN1(JTextField n1) {
		N1 = n1;
	}

	public JTextField getN2() {
		return N2;
	}

	public void setN2(JTextField n2) {
		N2 = n2;
	}

	public JTextField getN3() {
		return N3;
	}

	public void setN3(JTextField n3) {
		N3 = n3;
	}

	public JTextField getN4() {
		return N4;
	}

	public void setN4(JTextField n4) {
		N4 = n4;
	}

	public JButton getBoton_iniciar() {
		return boton_iniciar;
	}

	public void setBoton_iniciar(JButton boton_iniciar) {
		this.boton_iniciar = boton_iniciar;
	}

	public JButton getBoton_terminar() {
		return boton_terminar;
	}

	public void setBoton_terminar(JButton boton_terminar) {
		this.boton_terminar = boton_terminar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
