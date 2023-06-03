package Taller2;

public class Programadores {
	
	String nombre,apellido,pais,ciudad;
	String[] lenguajes;
	int id,añosExp;
	
	public Programadores( int id,String nombre, String apellido, int añosExp,String[] lenguajes, String pais, String ciudad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.añosExp = añosExp;
		this.lenguajes = lenguajes;
		this.pais = pais;
		this.ciudad = ciudad;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String[] getLenguajes() {
		return lenguajes;
	}

	public void setLenguajes(String[] lenguajes) {
		this.lenguajes = lenguajes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAñosExp() {
		return añosExp;
	}

	public void setAñosExp(int añosExp) {
		this.añosExp = añosExp;
	}

	public int getALenguages() {
		
		return lenguajes.length;
	}
	
	public void addLenguage(String lenguage) {
		
		
	}
	
}
