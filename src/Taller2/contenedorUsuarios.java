package Taller2;

public class contenedorUsuarios {
	
	private int max;
	private int cont;
	private usuarios[] contenedorUsuarios;
	
	public contenedorUsuarios(int max) {
		this.max = max;
		contenedorUsuarios = new usuarios[max];
		cont = 0;
	}
	
	public boolean agregarUsuario(usuarios usua) {
		// TODO Auto-generated method stub
		if(cont < max) {
			contenedorUsuarios[cont]= usua;
			cont++;
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean encontrarNombre(String nombreUsuario){  
		   int j = 0;
		   while (j< cont && !(contenedorUsuarios[j].getNombreUsuario().toUpperCase().equals(nombreUsuario))){ 
			     // Mientras este dentro de los limites del arreglo y no
		         // haya encontrado lo que se está buscando
		         j++; // Avance a la siguiente posición del arreglo
		   }
		   if(j == cont) {  //no lo encontró  
			   return true;
		   } 
		   return false;   // si lo encontró, en la posición j

		}  // end encontrar()

	public boolean encontrarAleatorio(int aleatorio){  
		   int j = 0;
		   while (j< cont && (contenedorUsuarios[j].getAleatorio()) == aleatorio){ 
			     // Mientras este dentro de los limites del arreglo y no
		         // haya encontrado lo que se está buscando
		         j++; // Avance a la siguiente posición del arreglo
		   }
		   if(j == cont) {  //no lo encontró  
			   return true;
		   } 
		   return false;   // si lo encontró, en la posición j

		}  // end encontrar()
	
	
	public boolean comprobarClave(String nombreUsuario,String clave) {
		int j = 0;
		   while (j< cont ){ 
			   if(contenedorUsuarios[j].getNombreUsuario().toUpperCase().equals(nombreUsuario.toUpperCase()) && 
					   contenedorUsuarios[j].getContrasena().equals(clave)) {
				   return true;
			   }
			   	j++;
		   }
		   return false;

	}
	//OL USO AHORA NO SE USAR CREO QUE NO SIRVE PARA NADA AUN xd
	public int devolverIdUsuarioProgramador(String nombreUsuario){  
		   int j = 0;
		   int valor = 0;
		   while (j< cont){ 
			   if(contenedorUsuarios[j].getNombreUsuario().toUpperCase().equals(nombreUsuario.toUpperCase())) {
				   valor = contenedorUsuarios[j].getIdProgramador();
			   }
		      j++;   
		   }
		   
		   return valor;
		}  
	
	public void cambiarNombreContrasena(String nombreUsuario, String nuevoNombreUsuario,String nuevaContrasena) {
		int j = 0;
		while (j< cont ){ 
			if(contenedorUsuarios[j].getNombreUsuario().toUpperCase().equals(nombreUsuario.toUpperCase())) {
				contenedorUsuarios[j].setNombreUsuario(nuevoNombreUsuario);
				contenedorUsuarios[j].setContrasena(nuevaContrasena);
				contenedorUsuarios[j].setNombreUsuarioConAleatorio(nuevoNombreUsuario+"#"+contenedorUsuarios[j].getAleatorio());
			}
			j++;
			
		   }
	}
	
	
	public String getNombreUsuario(int i) {
		return contenedorUsuarios[i].getNombreUsuario();
	}
	public int getIdProgrmador(int i) {
		return contenedorUsuarios[i].getIdProgramador();
	}
	public String getNombreUsuarioConAleatorio(int i) {
		return contenedorUsuarios[i].getNombreUsuarioConAleatorio();
	}
	public String getContrasena(int i){
		return contenedorUsuarios[i].getContrasena();
	}

	public void entregarPorPaises() {
		
		
	}

	public boolean getExistenciaid(int idUser) {
		
		for(int i = 0;i<cont;i++) {
			
			if(contenedorUsuarios[i].getIdProgramador() == idUser){
				
				return false;
				
			}
			
		}
		return true;
	}

	public void setNewPasswordUser(String password, int idUser) {
		
		for(int i = 0;i<cont;i++) {
			
			if(contenedorUsuarios[i].getIdProgramador() == idUser){
				
				contenedorUsuarios[i].setContrasena(password);;
				
				System.out.println("Cambio realizado :)");
				
			}
			
		}
		
	}

	public void setNewNameUser(String name, int idUser) {
		
		for(int i = 0;i<cont;i++) {
			
			if(contenedorUsuarios[i].getIdProgramador() == idUser){
				
				contenedorUsuarios[i].setNombreUsuario(name);
				
				System.out.println("Cambio realizado :)");
				
			}
			
		}
		
	}

	public void setNewidUser(int id, int idUser) {
		
		for(int i = 0;i<cont;i++) {
			
			if(contenedorUsuarios[i].getIdProgramador() == idUser){
				
				contenedorUsuarios[i].setIdProgramador(id);
				
				System.out.println("Cambio realizado :)");
				
			}
			
		}
	}
}
