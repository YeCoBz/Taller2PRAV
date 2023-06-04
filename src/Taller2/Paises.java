package Taller2;

public class Paises {
	
	String pais;
	String[] regiones;
	int cont;

	public Paises(String lista) {
		String[] partes = lista.split(",");
		pais = partes[0];
		regiones = new String[partes.length -1];
		int pos = 0;
		for(int i = 1;i<partes.length;i++) {
			regiones[pos] = partes[i];
			pos++;
		}
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getRegiones() {
		
		String texto = pais;
		for(int i = 0;i<regiones.length;i++) {
			texto += " " + regiones[i] + "";
		}
		return texto;
	}

	public void setRegiones(String[] regiones) {
		this.regiones = regiones;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	
	
	

		
		
}

