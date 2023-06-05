package Taller2;

public class contenedorDebilidades {
	
	private int max;
	private int cont;
	private debilidad[] contenedorDebilidades;
	
	public contenedorDebilidades(int max) {
		this.max = max;
		contenedorDebilidades = new debilidad[max];
		cont = 0;
	}
	
	public boolean agregarDebilidad(debilidad debilidad) {
		
		if(cont < max) {
			contenedorDebilidades[cont]= debilidad;
			cont++;
			return true;
		}else {
			return false;
		}
		
	}
	
	public void getDebilidad(int i) {
		System.out.println(contenedorDebilidades[i].getDebilidad());
	}
	public void mostarDebilidadesSegunNivel(int nivelAmenazaIa) {
		int j = 0;
		while (j< cont ){ 
			if(contenedorDebilidades[j].getNivelAmenaza() < nivelAmenazaIa) {
				System.out.println(contenedorDebilidades[j].getDebilidad());
			}
			j++;
		}
	}

	public void seeAllWaknesses() {
		
		System.out.println("------------ Debilidades ------------------");
		System.out.println("\n");
		
		for(int i = 0;i<cont;i++) {
			
			String w = contenedorDebilidades[i].getDebilidad();
			int n = contenedorDebilidades[i].getNivelAmenaza();
			
			System.out.println(w+", "+n);
			
			
		}
		
	}
	public String devolverDebilidad(int i) {
		return contenedorDebilidades[i].getDebilidad();
	}
	public int getNivelDebilidad(int i) {
		return contenedorDebilidades[i].getNivelAmenaza();
	}
}
