package Taller2;

public class usuarios {
	String nombreUsuarioConAleatorio,nombreUsuario,contrasena;
	int aleatorio,idProgramador;
	
	
	public usuarios(String nombreUsuario, String contrasena,int idProgramador) {
		this.nombreUsuarioConAleatorio = nombreUsuario;
		this.contrasena = contrasena;
		this.idProgramador= idProgramador;
		String [] partes = nombreUsuario.split("#");
		this.nombreUsuario = partes[0];
		this.aleatorio = Integer.parseInt(partes[1]);
	}





	public int getIdProgramador() {
		return idProgramador;
	}



	public void setIdProgramador(int idProgramador) {
		this.idProgramador = idProgramador;
	}


	public String getNombreUsuarioConAleatorio() {
		return nombreUsuarioConAleatorio;
	}


	public void setNombreUsuarioConAleatorio(String nombreUsuarioConAleatorio) {
		this.nombreUsuarioConAleatorio = nombreUsuarioConAleatorio;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public int getAleatorio() {
		return aleatorio;
	}


	public void setAleatorio(int aleatorio) {
		this.aleatorio = aleatorio;
	}
	
	
	
	
	
}
