package Taller2;

public class contenedorIATranshumanista implements interfazContenedores{
	
	private int max;
	private int cont;
	private Ias[] IATranshumanista;
	
	public contenedorIATranshumanista(int max) {
		this.max = max;
		IATranshumanista = new Ias[max];
		cont = 0;
	}

	@Override
	public boolean agregarIa(Ias ia) {
		// TODO Auto-generated method stub
		if(cont < max) {
			IATranshumanista[cont]= ia;
			cont++;
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public String getElementoString(int i, int elemento) {
		switch(elemento) {
		case 0:
			
			return IATranshumanista[i].getNombreIa();
			
		case 1:
			
			return IATranshumanista[i].getLenguajeIa();
		
		case 3:
			
			return IATranshumanista[i].getDebilidadIa();
			
		case 4:
			
			return IATranshumanista[i].getPaisCreacionIa();
			
		case 5:
			
			return IATranshumanista[i].getPresicionIa();
			
		case 6:
			
			return IATranshumanista[i].getTipoIa();
		
		default:
			return "error";
	}
	}

	@Override
	public int getElementoInt(int i, int elemento) {
		switch(elemento) {
		case 2:
			
			return IATranshumanista[i].getNivelAmenazaIa();
			
		case 7:
			
			return IATranshumanista[i].getIdCreadorIa();
		default:
			return 0;
	}
	}
}
