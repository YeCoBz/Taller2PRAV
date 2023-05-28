package Taller2;

public class Ias {
	
	private String nombreIa,lenguajeIa,debilidadIa,paisCreacionIa,tipoIa,presicionIa;
	private int nivelAmenazaIa,idCreadorIa;
	
	
	
	public String getNombreIa() {
		return nombreIa;
	}

	public void setNombreIa(String nombreIa) {
		this.nombreIa = nombreIa;
	}

	public String getLenguajeIa() {
		return lenguajeIa;
	}

	public void setLenguajeIa(String lenguajeIa) {
		this.lenguajeIa = lenguajeIa;
	}

	public String getDebilidadIa() {
		return debilidadIa;
	}

	public void setDebilidadIa(String debilidadIa) {
		this.debilidadIa = debilidadIa;
	}

	public String getPaisCreacionIa() {
		return paisCreacionIa;
	}

	public void setPaisCreacionIa(String paisCreacionIa) {
		this.paisCreacionIa = paisCreacionIa;
	}

	public String getTipoIa() {
		return tipoIa;
	}

	public void setTipoIa(String tipoIa) {
		this.tipoIa = tipoIa;
	}

	public String getPresicionIa() {
		return presicionIa;
	}

	public void setPresicionIa(String presicionIa) {
		this.presicionIa = presicionIa;
	}

	public int getNivelAmenazaIa() {
		return nivelAmenazaIa;
	}

	public void setNivelAmenazaIa(int nivelAmenazaIa) {
		this.nivelAmenazaIa = nivelAmenazaIa;
	}

	public int getIdCreadorIa() {
		return idCreadorIa;
	}

	public void setIdCreadorIa(int idCreadorIa) {
		this.idCreadorIa = idCreadorIa;
	}



	public Ias(String nombreIa, String lenguajeIa, String debilidadIa, String paisCreacionIa, String tipoIa,
			String presicionIa, int nivelAmenazaIa, int idCreadorIa) {

		this.nombreIa = nombreIa;
		this.lenguajeIa = lenguajeIa;
		this.debilidadIa = debilidadIa;
		this.paisCreacionIa = paisCreacionIa;
		this.tipoIa = tipoIa;
		this.presicionIa = presicionIa;
		this.nivelAmenazaIa = nivelAmenazaIa;
		this.idCreadorIa = idCreadorIa;
	}
}
