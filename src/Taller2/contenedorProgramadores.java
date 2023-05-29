package Taller2;

public class contenedorProgramadores {
	
	private int max;
	private int cont;
	private int contCiudades;
	private Programadores[] contenedorProgramadores;
	private String[] ciudades;
	
	public contenedorProgramadores(int max) {
		this.max = max;
		contenedorProgramadores = new Programadores[max];
		ciudades = new String[max];
		cont = 0;
		contCiudades = 0;
	}
	
	public boolean agregarProgramador(Programadores progra) {
		// TODO Auto-generated method stub
		if(cont < max) {
			contenedorProgramadores[cont]= progra;
			agregarCiudades(progra);
			cont++;
			return true;
		}else {
			return false;
		}
		
	}
	
	private void agregarCiudades(Programadores progra) {
		
		String ciudad = progra.getCiudad();
		int cont2 = 0;
		
		for (int i = 0; i<contCiudades;i++) {
			
			if (ciudades[i] != ciudad) {
				cont2++;
			} else { break;}
			
		}
		
		if (cont2 == contCiudades) {
			
			ciudades[contCiudades] = ciudad;
			contCiudades++;
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

	public void getPorPais(String pais) {
		
		for(int i = 0;i<cont;i++) {
			
			String paisProgramador = contenedorProgramadores[i].getCiudad();
			
			if (pais.equals(paisProgramador)) {
				
				System.out.println(contenedorProgramadores[i].getNombre());
			}
			
			
		}
		
	}
	
	public int getCont() {
		return cont;
	}

	public void getPorCiudad(String ciudad) {
		
		for(int i = 0;i<contCiudades;i++) {
			
			if (contenedorProgramadores[i].getCiudad() == ciudad) {
				
				System.out.println(contenedorProgramadores[i].getNombre());
			}
		}
		
	}
	
	public String getCiudades() {
		
		String texto = "";
		
		for (int i = 0; i<contCiudades;i++) {
			
			texto += ciudades[i]+",";
		}
		
		return texto;
	}
	
	
}
