package Taller2;

public class contenedorIASocial implements interfazContenedores{
	
	private int max;
	private int cont;
	private Ias[] IASocial;
	
	public contenedorIASocial(int max) {
		this.max = max;
		IASocial = new Ias[max];
		cont = 0;
	}

	@Override
	public boolean agregarIa(Ias ia) {
		// TODO Auto-generated method stub
		if(cont < max) {
			IASocial[cont]= ia;
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
			
			return IASocial[i].getNombreIa();
			
		case 1:
			
			return IASocial[i].getLenguajeIa();
		
		case 3:
			
			return IASocial[i].getDebilidadIa();
			
		case 4:
			
			return IASocial[i].getPaisCreacionIa();
			
		case 5:
			
			return IASocial[i].getPresicionIa();
			
		case 6:
			
			return IASocial[i].getTipoIa();
		
		default:
			return "error";
	}
	}

	@Override
	public int getElementoInt(int i, int elemento) {
		switch(elemento) {
		case 2:
			
			return IASocial[i].getNivelAmenazaIa();
			
		case 7:
			
			return IASocial[i].getIdCreadorIa();
		default:
			return 0;
	}
	}
	
	public void getIAs() {
		
		System.out.println("IA social: ");
		System.out.println("");
		for(int i = 0;i<cont;i++) {
			System.out.println("- "+IASocial[i].getNombreIa());
		}
		System.out.println("");
	}
}
