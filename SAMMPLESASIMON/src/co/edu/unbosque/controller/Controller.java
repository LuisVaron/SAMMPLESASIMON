package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import co.edu.unbosque.model.EjercicioArchivo;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private EjercicioArchivo m;
	private View gui;
	private String number;
	private String value;
	private int intentos;

	public Controller() {

		gui = new View();
		m = new EjercicioArchivo();
		number = "";
		value = "";
		intentos = 1;
		funcionar();

	}

	public void funcionar() {

		gui.getpNum().getBtn1().addActionListener(this);
		gui.getpNum().getBtn2().addActionListener(this);
		gui.getpNum().getBtn3().addActionListener(this);
		gui.getpNum().getBtn4().addActionListener(this);
		gui.getpResp().getBoton_iniciar().addActionListener(this);
		gui.getpResp().getBoton_terminar().addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		try {

			if (e.getActionCommand().equals("INICIAR")) {

				number = value = "";
				value = m.getSimon().Permutador();
				gui.getpResp().getBoton_iniciar().setEnabled(false);
				gui.getpResp().getN1().setText(value.substring(0, 1));
				gui.getpResp().getN2().setText(value.substring(1, 2));
				gui.getpResp().getN3().setText(value.substring(2, 3));
				gui.getpResp().getN4().setText(value.substring(3));

			} else if (e.getActionCommand().equals("1")) {

				number += "1";
				gui.getpNum().getBtn1().setEnabled(false);

			} else if (e.getActionCommand().equals("2")) {

				number += "2";
				gui.getpNum().getBtn2().setEnabled(false);

			} else if (e.getActionCommand().equals("3")) {

				number += "3";
				gui.getpNum().getBtn3().setEnabled(false);

			} else if (e.getActionCommand().equals("4")) {

				number += "4";
				gui.getpNum().getBtn4().setEnabled(false);

			} else if (e.getActionCommand().equals("TERMINAR")) {

				gui.getpNum().getBtn1().setEnabled(true);
				gui.getpNum().getBtn2().setEnabled(true);
				gui.getpNum().getBtn3().setEnabled(true);
				gui.getpNum().getBtn4().setEnabled(true);
				
				if(Integer.parseInt(number) == Integer.parseInt(value)) {
					

					gui.getpResp().getBoton_iniciar().setEnabled(true);
					gui.pop(Integer.parseInt(number) == Integer.parseInt(value), "Secuencia exitosa!");
					intentos = 0;
					
					
				} else if (intentos<Integer.parseInt(m.LeerPropiedades("intentos"))) {
					
					gui.pop(Integer.parseInt(number) == Integer.parseInt(value), "Fallaste!, te quedan " +(Integer.parseInt(m.LeerPropiedades("intentos"))-intentos) + " intentos");
					intentos++;
					
				} else {
					
					gui.getpResp().getBoton_iniciar().setEnabled(true);
					gui.pop(Integer.parseInt(number) == Integer.parseInt(value), "GAME OVER!!!!");
					intentos = 0;
					
				}

			}

		} catch (Exception x) {
			System.out.println(x);
		}
	}
}
