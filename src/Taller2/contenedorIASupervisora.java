package Taller2;

public class contenedorIASupervisora implements interfazContenedores{

	private int max;
	private int cont;
	private Ias[] IASupervisora;
	
	public contenedorIASupervisora(int max) {
		this.max = max;
		IASupervisora = new Ias[max];
		cont = 0;
	}

	@Override
	public boolean agregarIa(Ias ia) {
		// TODO Auto-generated method stub
		if(cont < max) {
			IASupervisora[cont]= ia;
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
			
			return IASupervisora[i].getNombreIa();
			
		case 1:
			
			return IASupervisora[i].getLenguajeIa();
		
		case 3:
			
			return IASupervisora[i].getDebilidadIa();
			
		case 4:
			
			return IASupervisora[i].getPaisCreacionIa();
			
		case 5:
			
			return IASupervisora[i].getPresicionIa();
			
		case 6:
			
			return IASupervisora[i].getTipoIa();
		
		default:
			return "error";
	}
	}

	@Override
	public int getElementoInt(int i, int elemento) {
		switch(elemento) {
		case 2:
			
			return IASupervisora[i].getNivelAmenazaIa();
			
		case 7:
			
			return IASupervisora[i].getIdCreadorIa();
		default:
			return 0;
	}
	}
	public void getIAs() {
		
		System.out.println("IA supervisora: ");
		System.out.println("");
		for(int i = 0;i<cont;i++) {
			System.out.println("- "+IASupervisora[i].getNombreIa());
		}
		System.out.println("");
	}
}
