package Taller2;

public class contenedorPaises {
	
	private int max;
	private int cont;
	private Paises[] lista;
	
	public contenedorPaises(int max) {
		this.max = max;
		lista = new Paises[max];
		cont = 0;
	}
	
	public void agregarPaises(Paises pais) {
		
		if (cont < max) {
			lista[cont] = pais;
			cont++;
		}
	}
	
	public Paises mostrarPaises(int pos) {
		
		Paises pais = lista[pos];
		
		return pais;
		
		
		
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	

}
