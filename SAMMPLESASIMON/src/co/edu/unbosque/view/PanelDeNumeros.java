package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelDeNumeros extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;

	public PanelDeNumeros() {

		setLayout(null);

		inicializarComponentes();

		setVisible(true);
		
		setBackground(Color.GRAY);
		
	}

	public void inicializarComponentes() {

		setBorder(new TitledBorder(" "));
		btn1 = new JButton("1");
		btn1.setFont(new Font("Comic Sans",Font.BOLD,50));
		btn1.setBackground(Color.CYAN);
		btn1.setBounds(0, 0, 165, 130);
		btn1.setActionCommand("1");
		add(btn1);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Comic Sans",Font.BOLD,50));
		btn2.setBackground(Color.GREEN);
		btn2.setBounds(165, 0, 165, 130);
		btn2.setActionCommand("2");
		add(btn2);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Comic Sans",Font.BOLD,50));
		btn3.setBackground(Color.RED);
		btn3.setBounds(0, 130, 165, 130);
		btn3.setActionCommand("3");
		add(btn3);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Comic Sans",Font.BOLD,50));
		btn4.setBackground(Color.YELLOW);
		btn4.setBounds(165, 130, 165, 130);
		btn4.setActionCommand("4");
		add(btn4);

	}

	public JButton getBtn1() {
		return btn1;
	}

	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public void setBtn3(JButton btn3) {
		this.btn3 = btn3;
	}

	public JButton getBtn4() {
		return btn4;
	}

	public void setBtn4(JButton btn4) {
		this.btn4 = btn4;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
