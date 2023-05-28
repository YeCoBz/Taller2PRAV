package Taller2;

public class contenedorIas {
	
	private int max;
	private int cont;
	private Ias[] contenedorIas;
	
	
	public contenedorIas(int max) {
		this.max = max;
		contenedorIas = new Ias[max];
		cont = 0;
	}
	
	public boolean agregarIas(Ias ia) {
		// TODO Auto-generated method stub
		if(cont < max) {
			contenedorIas[cont]= ia;
			cont++;
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public String getNombre(int i) {
		return contenedorIas[i].getNombreIa();
	}
	
	public String getLenguaje(int i) {
		return contenedorIas[i].getLenguajeIa();
	}
	
	public int getNivelAmenaza(int i) {
		return contenedorIas[i].getNivelAmenazaIa();
	}
	
	public String getDebilidad(int i) {
		return contenedorIas[i].getDebilidadIa();
	}
	
	public String getPais(int i) {
		return contenedorIas[i].getPaisCreacionIa();
	}
	
	public String getPrecision(int i) {
		return contenedorIas[i].getPresicionIa();
	}
	
	public String getTipo(int i) {
		return contenedorIas[i].getTipoIa();
	}
	
	public int getIdCreador(int i) {
		return contenedorIas[i].getIdCreadorIa();
	}
	
	public void mostrarIasSinDebilidad() {
		for(int i = 0; i<this.cont;i++) {
			if(contenedorIas[i].getDebilidadIa().toLowerCase().equals("desconocida")) {
				System.out.println("NombreIa= "+contenedorIas[i].getNombreIa()+" ,Lenguaje= "+contenedorIas[i].getLenguajeIa()+" ,Nivel de  amenaza= "+contenedorIas[i].getNivelAmenazaIa()
						+" ,Debilidad= "+contenedorIas[i].getDebilidadIa()+" ,Pais de creacion= "+contenedorIas[i].getPaisCreacionIa()
						+" ,Precision= "+contenedorIas[i].getPresicionIa()+" ,Tipo de ia= "+contenedorIas[i].getTipoIa()
						+" ,Id del creador= "+contenedorIas[i].getIdCreadorIa());
			}
		}
		
	}
	
	public void mostrarIas() {
		for(int i = 0; i<this.cont;i++) {
			System.out.println("NombreIa= "+contenedorIas[i].getNombreIa()+" ,Lenguaje= "+contenedorIas[i].getLenguajeIa()+" ,Nivel de  amenaza= "+contenedorIas[i].getNivelAmenazaIa()
					+" ,Debilidad= "+contenedorIas[i].getDebilidadIa()+" ,Pais de creacion= "+contenedorIas[i].getPaisCreacionIa()
					+" ,Precision= "+contenedorIas[i].getPresicionIa()+" ,Tipo de ia= "+contenedorIas[i].getTipoIa()
					+" ,Id del creador= "+contenedorIas[i].getIdCreadorIa());
		}
	}
	
	public int revisarSiExistenIasSinDebilidades(int comprobador) {
		comprobador = 0;
		for(int i = 0; i<this.cont;i++) {
			if(contenedorIas[i].getDebilidadIa().toLowerCase().equals("desconocida")) {
				comprobador++;
			}
		}
		return comprobador;
	}
	
	
	
	public boolean comprobarId(int idCreador){  
		   int j = 0;
		   while (j< cont && !(contenedorIas[j].getIdCreadorIa() == idCreador)){ 
			     // Mientras este dentro de los limites del arreglo y no
		         // haya encontrado lo que se está buscando
		         j++; // Avance a la siguiente posición del arreglo
		   }
		   if(j == cont) {  //no lo encontró  
			   return true;
		   } 
		   return false;   // si lo encontró, en la posición j

		}  // end encontrar()
	
	public int devolverNivelAmenaza(int idCreador){  
		   int j = 0;
		   int valorDevolver = 0;
		   while (j< cont && contenedorIas[j].getIdCreadorIa() == idCreador){ 
			     // Mientras este dentro de los limites del arreglo y no
		         // haya encontrado lo que se está buscando
			   valorDevolver= contenedorIas[j].getNivelAmenazaIa();  
			   j++; // Avance a la siguiente posición del arreglo
		         
		   }
		   return valorDevolver;
		}  // end encontrar()
	
	//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	public String devolverLenguajeIa(int idCreador) {
		int j = 0;
		   String lenguaje = null;
		   while (j< cont ){ 
			    if(contenedorIas[j].getIdCreadorIa() == idCreador) {
			    	lenguaje= contenedorIas[j].getLenguajeIa();
			    }
		        j++; 
		        
		   }
		   return lenguaje;
		}
	public void modificarDebilidad(String debilidad,int idProgramador) {
		int j = 0;
		while (j< cont ){ 
		    if(contenedorIas[j].getIdCreadorIa() == idProgramador) {
		    	contenedorIas[j].setDebilidadIa(debilidad);
		    }
	        j++;     
	   }	
	}
	
	public void modificarPorcentajePrecision(int porcentaje,int idProgramador) {
		int j = 0;
		String nuevoPorcentaje = porcentaje+"%";
		while (j< cont ){ 
		    if(contenedorIas[j].getIdCreadorIa() == idProgramador) {
		    	contenedorIas[j].setPresicionIa(nuevoPorcentaje);
		    }
	        j++;     
	   }	
	}
	
	public void mostrarTipoIa(String tipo) {
		int j = 0;
		while (j< cont ){ 
		    if(contenedorIas[j].getTipoIa().toUpperCase().equals(tipo.toUpperCase())) {
		    	System.out.println("NombreIa= "+contenedorIas[j].getNombreIa()+" ,Lenguaje= "+contenedorIas[j].getLenguajeIa()+" ,Nivel de  amenaza= "+contenedorIas[j].getNivelAmenazaIa()
						+" ,Debilidad= "+contenedorIas[j].getDebilidadIa()+" ,Pais de creacion= "+contenedorIas[j].getPaisCreacionIa()
						+" ,Precision= "+contenedorIas[j].getPresicionIa()+" ,Tipo de ia= "+contenedorIas[j].getTipoIa()
						+" ,Id del creador= "+contenedorIas[j].getIdCreadorIa());
		    }
	        j++;     
	   }
	}
}
