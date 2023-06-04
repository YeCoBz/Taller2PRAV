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
		
		String pais1 = pais;

		
		for(int i = 0;i<cont;i++) {
			
			String paisProgramador = contenedorProgramadores[i].getPais();
			
			if (paisProgramador.equals(pais1)) {
				
				String nombre = contenedorProgramadores[i].getNombre();
				
				System.out.println(nombre);
				
			}
			
			
		}
		
	}
	
	public int getCont() {
		return cont;
	}

	public void getPorCiudad(String ciudad) {
		
		for(int i = 0;i<cont;i++) {
			
			String ciudad1 = ciudad;
			String programmerCity = contenedorProgramadores[i].getCiudad();
			String nombre = contenedorProgramadores[i].getNombre();
			
			if (programmerCity.equals(ciudad1)) {
				
				System.out.println(nombre);
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


	public void getForExpYears() {
		
		for(int i = 0;i<cont;i++) {
			int years = contenedorProgramadores[i].getAñosExp();
			String name = contenedorProgramadores[i].getNombre();
			
			System.out.println(name+": "+years+" años");
		}
		
	}
	
	public void getAmountLenguage() {
		
		for(int i = 0;i<cont;i++) {
			
			int amountLenguages = contenedorProgramadores[i].getALenguages();
			String name = contenedorProgramadores[i].getNombre();
			
			System.out.println(name+": "+amountLenguages+" lenguajes");
		}
	}
	
	public void getByID() {
		
		for(int i = 0;i<cont;i++) {
			
			int id = contenedorProgramadores[i].getId();
			String name = contenedorProgramadores[i].getNombre();
			
			System.out.println(name+", ID: "+id);
		}
	}

	public void setAddLenguage(String lenguageAdd, int idProgrammer) {
		
		
		
	}

	public void setExpYears(int expYears, int idProgrammer) {
		
		for(int i = 0;i<cont;i++) {
			
			if(contenedorProgramadores[i].getId() == idProgrammer){
				
				contenedorProgramadores[i].setId(expYears);
				
				System.out.println("Cambio realizado :)");
				
			}
			
		}
		
	}

	public void setContryProgrammer(String contry, int idProgrammer) {
		
		for(int i = 0;i<cont;i++) {
			
			if(contenedorProgramadores[i].getId() == idProgrammer){
				
				contenedorProgramadores[i].setPais(contry);
				
				System.out.println("Cambio realizado :)");
				
			}
			
		}
	}

	public void setCityProgrammer(String city, int idProgrammer) {
		
		for(int i = 0;i<cont;i++) {
			
			if(contenedorProgramadores[i].getId() == idProgrammer){
				
				contenedorProgramadores[i].setCiudad(city);
				
				System.out.println("Cambio realizado :)");
				
			}
			
		}
		
	}

	public void setIDProgrammer(int newID, int idProgrammer) {
		
		for(int i = 0;i<cont;i++) {
			
			if(contenedorProgramadores[i].getId() == idProgrammer){
				
				contenedorProgramadores[i].setId(newID);
				
				System.out.println("Cambio realizado :)");
				
			}
			
		}
	}

	public void setNameProgrammer(String name, int idProgrammer) {
		
		for(int i = 0;i<cont;i++) {
			
			if(contenedorProgramadores[i].getId() == idProgrammer){
				
				contenedorProgramadores[i].setNombre(name);
				
				System.out.println("Cambio realizado :)");
				
			}
			
		}
		
	}

	public void setLastnameProgrammer(String lastName, int idProgrammer) {
		
		for(int i = 0;i<cont;i++) {
			
			if(contenedorProgramadores[i].getId() == idProgrammer){
				
				contenedorProgramadores[i].setApellido(lastName);
				
				System.out.println("Cambio realizado :)");
				
			}
			
		}
		
	}

	public boolean getExistenceID(int newID) {
		
		for(int i = 0;i<cont;i++) {
			
			if(contenedorProgramadores[i].getId() == newID){
				
				return false;
				
			}
			
		}
		return true;
	}

	public boolean getExistenciaid(int idProgrammer) {

		for(int i = 0;i<cont;i++) {
			
			if(contenedorProgramadores[i].getId() == idProgrammer){
				
				return true;
				
			}
			
		}
		return false;
	}

	public int getByCountry(String country) {
		
		int c = 0;
		
		for(int i = 0;i<cont;i++) {
			
			if(contenedorProgramadores[i].getPais().equals(country)){
				c++;
			}
		}
		return c;

	}
	
	public String[] getListCities() {
		return ciudades;
	}

	public int prByCities(String city) {
		
		int c = 0;
		
		for(int i = 0;i<cont;i++) {
			
			if(contenedorProgramadores[i].getPais().equals(city)){
				c++;
			}
		}
		return c;

	}


}
