package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Propiedades;
import co.edu.unbosque.model.persistence.Simon;

public class EjercicioArchivo {

	private Propiedades prop;
	private Simon simon;

	public EjercicioArchivo() {
		prop = new Propiedades();
		simon = new Simon();
	}

	public String gestionarPropiedades() {

		prop.escribirPropiedades();

		return "Prop";
	}

	public String LeerPropiedades(String llave) {
		
		return prop.leerPropiedades(llave);
	}

	public Propiedades getProp() {
		return prop;
	}

	public void setProp(Propiedades prop) {
		this.prop = prop;
	}

	public Simon getSimon() {
		return simon;
	}

	public void setSimon(Simon simon) {
		this.simon = simon;
	}

}
