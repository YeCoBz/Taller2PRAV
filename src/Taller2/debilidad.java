package Taller2;

public class debilidad {
	
	String debilidad;
	int nivelAmenaza;
	public String getDebilidad() {
		return debilidad;
	}
	
	public void setDebilidad(String debilidad) {
		this.debilidad = debilidad;
	}
	public int getNivelAmenaza() {
		return nivelAmenaza;
	}
	public void setNivelAmenaza(int nivelAmenaza) {
		this.nivelAmenaza = nivelAmenaza;
	}
	public debilidad(String debilidad, int nivelAmenaza) {
		this.debilidad = debilidad;
		this.nivelAmenaza = nivelAmenaza;
	}
	
}
