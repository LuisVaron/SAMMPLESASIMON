package co.edu.unbosque.model.persistence;

public class Simon {

	private String[] Permutacion;

	public Simon() {
		Permutacion = new String[24];
		Numero();
	}

	public void Numero() {

		Permutacion[0] = "1234";
		Permutacion[1] = "1243";
		Permutacion[2] = "1324";
		Permutacion[3] = "1342";
		Permutacion[4] = "1423";
		Permutacion[5] = "1432";
		Permutacion[6] = "2134";
		Permutacion[7] = "2143";
		Permutacion[8] = "2314";
		Permutacion[9] = "2341";
		Permutacion[10] = "2413";
		Permutacion[11] = "2431";
		Permutacion[12] = "3124";
		Permutacion[13] = "3142";
		Permutacion[14] = "3214";
		Permutacion[15] = "3241";
		Permutacion[16] = "3412";
		Permutacion[17] = "3421";
		Permutacion[18] = "4123";
		Permutacion[19] = "4132";
		Permutacion[20] = "4213";
		Permutacion[21] = "4231";
		Permutacion[22] = "4312";
		Permutacion[23] = "4321";

	}

	public String Permutador() {

		String value = Permutacion[(int) (Math.random() * 24+0)];

		return value;
	}
}
