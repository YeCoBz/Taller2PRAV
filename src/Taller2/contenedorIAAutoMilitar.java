package Taller2;

public class contenedorIAAutoMilitar implements interfazContenedores {
	
	private int max;
	private int cont;
	private Ias[] IAAutoMilitar;
	
	public contenedorIAAutoMilitar(int max) {
		this.max = max;
		IAAutoMilitar = new Ias[max];
		this.cont = 0;
	}

	@Override
	public boolean agregarIa(Ias ia) {
		// TODO Auto-generated method stub
		if(cont < max) {
			IAAutoMilitar[cont]= ia;
			cont++;
			return true;
		}else {
			return false;
		}
		
	}
	//Esta funcion trata de devolver los valores de tipo String del objeto que se encuentra guardado en la posicion que se busque, el "elemento" hace
	//referencia al elemento que se desea retornar.
	public String getElementoString(int i,int elemento) {
		
		switch(elemento) {
			case 0:
				
				return IAAutoMilitar[i].getNombreIa();
				
			case 1:
				
				return IAAutoMilitar[i].getLenguajeIa();
			
			case 3:
				
				return IAAutoMilitar[i].getDebilidadIa();
				
			case 4:
				
				return IAAutoMilitar[i].getPaisCreacionIa();
				
			case 5:
				
				return IAAutoMilitar[i].getPresicionIa();
				
			case 6:
				
				return IAAutoMilitar[i].getTipoIa();
			
			default:
				return "error";
		}
			
	}
	//Esta funcion trata de devolver los valores de tipo int del objeto que se encuentra guardado en la posicion que se busque, el "elemento" hace referencia
	//a si se desea obtener el nivel de amenaza(ingresar 2) o el id del creador(ingresar 7)
	public int getElementoInt(int i, int elemento) {
		
		switch(elemento) {
		case 2:
			
			return IAAutoMilitar[i].getNivelAmenazaIa();
			
		case 7:
			
			return IAAutoMilitar[i].getIdCreadorIa();
		default:
			return 0;
	}
}
	
	public int getCont() {
		return cont;
	}
}
