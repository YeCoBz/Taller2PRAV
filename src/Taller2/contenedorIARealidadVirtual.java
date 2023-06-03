package Taller2;

public class contenedorIARealidadVirtual implements interfazContenedores{

	private int max;
	private int cont;
	private Ias[] IARealidadVirtual;
	
	public contenedorIARealidadVirtual(int max) {
		this.max = max;
		IARealidadVirtual = new Ias[max];
		cont = 0;
	}

	@Override
	public boolean agregarIa(Ias ia) {
		// TODO Auto-generated method stub
		if(cont < max) {
			IARealidadVirtual[cont]= ia;
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
			
			return IARealidadVirtual[i].getNombreIa();
			
		case 1:
			
			return IARealidadVirtual[i].getLenguajeIa();
		
		case 3:
			
			return IARealidadVirtual[i].getDebilidadIa();
			
		case 4:
			
			return IARealidadVirtual[i].getPaisCreacionIa();
			
		case 5:
			
			return IARealidadVirtual[i].getPresicionIa();
			
		case 6:
			
			return IARealidadVirtual[i].getTipoIa();
		
		default:
			return "error";
	}
	}

	@Override
	public int getElementoInt(int i, int elemento) {
		switch(elemento) {
		case 2:
			
			return IARealidadVirtual[i].getNivelAmenazaIa();
			
		case 7:
			
			return IARealidadVirtual[i].getIdCreadorIa();
		default:
			return 0;
	}
	}
	public void getIAs() {
		
		System.out.println("IA de realidad virtual: ");
		System.out.println("");
		for(int i = 0;i<cont;i++) {
			System.out.println("- "+IARealidadVirtual[i].getNombreIa());
		}
		System.out.println("");
	}
}
