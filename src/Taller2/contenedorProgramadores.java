package Taller2;

public class contenedorProgramadores {
	
	private int max;
	private int cont;
	private Programadores[] contenedorProgramadores;
	
	public contenedorProgramadores(int max) {
		this.max = max;
		contenedorProgramadores = new Programadores[max];
		cont = 0;
	}
	
	public boolean agregarProgramador(Programadores progra) {
		// TODO Auto-generated method stub
		if(cont < max) {
			contenedorProgramadores[cont]= progra;
			cont++;
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean comprobarLenguaje(int id,String lenguaje) {
		int p = 0;
		boolean valor = false;
		while(p<cont) {
			if(contenedorProgramadores[p].getId() == id) {
				String[] lista = contenedorProgramadores[p].getLenguajes();
				for(int j=0; j<lista.length;j++) {
					if(lista[j].toUpperCase().strip().equals(lenguaje.toUpperCase())) {
						valor = true;
					}
				}
			}
			p++;
		}
		return valor;
	}
	
	public int getId(int i) {
		return contenedorProgramadores[i].getId();
	}
	
	public String getNombre(int i) {
		return contenedorProgramadores[i].getNombre();
	}
	
	public String getApellido(int i) {
		return contenedorProgramadores[i].getApellido();
	}
	
	public int getAnosExperiencia(int i) {
		return contenedorProgramadores[i].getAñosExp();
	}
	
	public String getLenguajes(int i) {
		String lenguajes = "";
		String[] lista = contenedorProgramadores[i].getLenguajes();
		for(int j= 0;j<lista.length;j++) {
			lenguajes += lista[j]+",";
		}
		return lenguajes;
	}
	
	public String getPais(int i) {
		return contenedorProgramadores[i].getPais();
	}
	
	public String getCiudad(int i) {
		return contenedorProgramadores[i].getCiudad();
	}
}
