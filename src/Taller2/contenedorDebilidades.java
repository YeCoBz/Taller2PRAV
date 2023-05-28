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
		// TODO Auto-generated method stub
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
}
