package co.edu.unbosque.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelDeRespuestas pResp;
	private PanelDeNumeros pNum;
	private PanelImagen pim;
	private JLayeredPane lpane;

	public View() {

		setTitle("SIMON");

		setSize(500, 400);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setLayout(null);

		inicializarComponentes();

		setResizable(false);

		setLocationRelativeTo(null);

		setVisible(true);
	}

	public void inicializarComponentes() {

		lpane = new JLayeredPane(); 
		getContentPane().add(lpane,BorderLayout.CENTER);
		lpane.setBounds(0,0,500,400);
		
		pim = new PanelImagen();
		pim.setBounds(0, 0, 500, 400);
		pim.setOpaque(true);
		lpane.add(pim,0);	
		
		pNum = new PanelDeNumeros();
		pNum.setBounds(80, 15, 330, 260);
		pNum.setOpaque(true);
		lpane.add(pNum,0);

		pResp = new PanelDeRespuestas();
		pResp.setBounds(25, 275, 435, 65);
		pResp.setOpaque(false);
		lpane.add(pResp,0);
	}

	public void pop(boolean dato, String mensaje) {
		if(!dato) {
			JOptionPane.showMessageDialog(null,mensaje,null,JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null,mensaje);
		}
	}

	public PanelDeRespuestas getpResp() {
		return pResp;
	}

	public void setpResp(PanelDeRespuestas pResp) {
		this.pResp = pResp;
	}

	public PanelDeNumeros getpNum() {
		return pNum;
	}

	public void setpNum(PanelDeNumeros pNum) {
		this.pNum = pNum;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
