package Taller2;


import java.io.*;
import java.util.Scanner;


public class App {

	public static void main(String[] args) throws IOException {
		
		System.out.println("gei el que lo lea, peruanos pe causa la conchatumare");
		
		Scanner scanner = new Scanner(System.in);
		
		int tamMaximo=900;
		
		
		contenedorIas contenedorIas = new contenedorIas(tamañoFilas("IA.txt"));
		contenedorIAAutoMilitar contenedorMilitar = new contenedorIAAutoMilitar(tamMaximo);
		contenedorIASupervisora contenedorSupervisora = new contenedorIASupervisora(tamMaximo);
		contenedorIATranshumanista contenedorTranshumanista = new contenedorIATranshumanista(tamMaximo);
		contenedorIASocial contenedorSocial = new contenedorIASocial(tamMaximo);
		contenedorIARealidadVirtual contenedorRv = new contenedorIARealidadVirtual(tamMaximo);
		contenedorUsuarios contenedorUsuarios = new contenedorUsuarios(tamañoFilas("Usuarios.txt"));
		contenedorProgramadores contenedorProgramadores = new contenedorProgramadores(tamañoFilas("Programadores.txt"));
		contenedorDebilidades contenedorDebilidades = new contenedorDebilidades(tamañoFilas("Debilidades.txt"));
		contenedorPaises contenedorPaisesRegiones = new contenedorPaises(tamañoFilas("Países.txt"));
		agregarPaisesAContenedores(contenedorPaisesRegiones);

		mostrarProgramadoresPorCiudad(contenedorPaisesRegiones,contenedorProgramadores);
		
		System.out.println("HOLAAAAAAAAAAAAAAAA "+random5());
		
		agregarDebilidades(contenedorDebilidades);
		guardarIas(contenedorMilitar,contenedorSupervisora,contenedorTranshumanista,contenedorSocial,contenedorRv,contenedorIas);
		Ias nombre1 = new Ias(null, null, null, null, null, null, 2, 0);
		System.out.println(nombre1.getNivelAmenazaIa());
		System.out.println("hila");
		guardarProgramadores(contenedorProgramadores);
		System.out.println("hola");
		guardarUsuarios(contenedorUsuarios);
		
		System.out.println(contenedorProgramadores.getLenguajes(0));
		System.out.println("Que desea realizar: Iniciar sesion(I) o registrarse(R)");
		String opcionIngresada = scanner.nextLine().toUpperCase();
		String nombreFinal;
		int idFinal;
		while(!opcionIngresada.equals("I") && !opcionIngresada.equals("R")) {
			System.out.println("Opcion no valida, ingrese I=Iniciar sesion o R=Registrarse");
			opcionIngresada = scanner.nextLine().toUpperCase();
		}
		if(opcionIngresada.equals("I")) {
			System.out.println("Ingrese nombre de usuario: ");
			String nombreIngresado = scanner.nextLine();
			while(contenedorUsuarios.encontrarNombre(nombreIngresado.toUpperCase()) && !nombreIngresado.toLowerCase().equals("empanadasconchapalele")) {
				System.out.println("Nombre ingresado inexistente, ingrese uno valido");
				nombreIngresado = scanner.nextLine();
			}
			System.out.println("Ingrese la contraseña:");
			String claveIngresada = scanner.nextLine();
			if(nombreIngresado.equals("empanadasconchapalele")) {
				while(!claveIngresada.toLowerCase().equals("suricatarabiosa")) {
					System.out.println("Clave incorrecta, vuelva a ingresar la contraseña");
					claveIngresada = scanner.nextLine();
				}
			}else {
				while(!contenedorUsuarios.comprobarClave(nombreIngresado, claveIngresada)) {
					System.out.println("Clave incorrecta, vuelva a ingresar la contraseña");
					claveIngresada = scanner.nextLine();
				}
			}
	
			nombreFinal = nombreIngresado;
			idFinal = contenedorUsuarios.devolverIdUsuarioProgramador(nombreFinal);
			System.out.println(idFinal);
			
			System.out.println("-------------Inicio de sesion exitoso!!!---------------");
			
		}else {
			System.out.println("Ingrese nombre de usuario: ");
			String nombreIngresado = scanner.nextLine();
			while(!contenedorUsuarios.encontrarNombre(nombreIngresado.toUpperCase()) || nombreIngresado.equals(opcionIngresada)) {
				System.out.println("Nombre ya existente, ingrese uno distinto");
				nombreIngresado = scanner.nextLine();
			}
			System.out.println("Ingrese contraseña:");
			String claveIngresada = scanner.nextLine();
			//Controlador por si el numero random/id se llegara a repetir
			int id= random5();
			while(contenedorUsuarios.encontrarAleatorio(id)) {
				id = random5();
			}
			String nombre = nombreIngresado+"#"+id;
			
			usuarios usuario = new usuarios(nombre, claveIngresada,id);
			
			System.out.println("-------------Creacion de programador------------");
			
			System.out.println("Ingrese nombre del programador:");
			String nombreProgramadorIngresado= scanner.nextLine();
			System.out.println("Ingrese apellido del programador:");
			String apellidoProgramadorIngresado= scanner.nextLine();
			System.out.println("Ingrese años de experiencias:");
			int añosExpIngresados = Integer.parseInt(scanner.nextLine());
			System.out.println("Ingrese la cantidad de lenguajes de programacion que sabe el programador:");
			int cantLenguajes = Integer.parseInt(scanner.nextLine());
			String[] listaLenguajes= new String[cantLenguajes];
			for(int i = 0;i<cantLenguajes;i++) {
				System.out.println("Ingrese el lenguaje: ");
				String lenguajeIngresado = scanner.nextLine();
				//Controlador para que no se ingrese el mismo lenguaje
				while(i>=1 && !comprobarSiLenagujeExiste(listaLenguajes, lenguajeIngresado, i)) {
					System.out.println("Lenguaje ya ingresado,ingrese uno distinto:");
					lenguajeIngresado = scanner.nextLine();
				}
				listaLenguajes[i]= lenguajeIngresado;
			}
			System.out.println("Ingrese Pais:");
			String paisIngresado = scanner.nextLine();
			System.out.println("Ingrese Ciudad: ");
			String ciudadIngresada = scanner.nextLine();
			Programadores programador = new Programadores(id, nombreProgramadorIngresado, apellidoProgramadorIngresado, añosExpIngresados
					, listaLenguajes, paisIngresado, ciudadIngresada);
			

			contenedorProgramadores = new contenedorProgramadores(tamañoFilas("Programadores.txt")+1);

			guardarProgramadores(contenedorProgramadores);

			contenedorProgramadores.agregarProgramador(programador);

			contenedorUsuarios = new contenedorUsuarios(tamañoFilas("Usuarios.txt")+1);

			guardarUsuarios(contenedorUsuarios);

			contenedorUsuarios.agregarUsuario(usuario);

			//Despues agregar al txt no olvidar
			
			guardarDatosProgramadores("Programadores.txt",tamañoFilas("Programadores.txt")+1,contenedorProgramadores);
			guardarDatosUsuarios("Usuarios.txt",tamañoFilas("Usuarios.txt")+1,contenedorUsuarios);
			
			
			nombreFinal = nombreIngresado;
			idFinal = contenedorUsuarios.devolverIdUsuarioProgramador(nombreFinal);
			System.out.println(idFinal);
			System.out.println("-------------Usuario creado con exito!!!-----------------");
		}
		
		if(nombreFinal.equals("empanadasconchapalele")) {

			System.out.println("------------Menu Admin------------------");
			System.out.println("1) Ver todos los programadores");
			System.out.println("2) Ver todas las IA");
			System.out.println("3) Editar datos programador");
			System.out.println("4) Editar datos IA");
			System.out.println("5) Editar datos de Usuario");
			System.out.println("6) Crear y visualizar debilidades");
			System.out.println("7) Crear una IA, programador, País");
			System.out.println("8) Dar estadísticas por países");
			
			String opcionMenuAdmin = scanner.nextLine();
			
			while(!opcionMenuAdmin.equals("1") && !opcionMenuAdmin.equals("2") && !opcionMenuAdmin.equals("3") &&
					!opcionMenuAdmin.equals("4") && !opcionMenuAdmin.equals("5") && !opcionMenuAdmin.equals("6") &&
					!opcionMenuAdmin.equals("7") && !opcionMenuAdmin.equals("8")) {
				
				System.out.println("------------Menu Admin------------------");
				System.out.println("1) Ver todos los programadores");
				System.out.println("2) Ver todas las IA");
				System.out.println("3) Editar datos programador");
				System.out.println("4) Editar datos IA");
				System.out.println("5) Editar datos de Usuario");
				System.out.println("6) Crear y visualizar debilidades");
				System.out.println("7) Crear una IA, programador, País");
				System.out.println("8) Dar estadísticas por países");
				
				opcionMenuAdmin = scanner.nextLine();
			}
			
			switch (opcionMenuAdmin) {
			
			case "1":
				
				System.out.println("------------ Ver Por ------------------");
				System.out.println("1) País");
				System.out.println("2) Ciudad");
				System.out.println("3) Años experiencia");
				System.out.println("4) Cantidad de lenguajes");
				System.out.println("5) Por ID");
				
				String opcionUnoAdmin = scanner.nextLine();
				
				while(!opcionUnoAdmin.equals("1") && !opcionUnoAdmin.equals("2") && !opcionUnoAdmin.equals("3") &&
						!opcionUnoAdmin.equals("4") && !opcionUnoAdmin.equals("5")) {
					
					System.out.println("------------ Ver Por ------------------");
					System.out.println("1) País");
					System.out.println("2) Ciudad");
					System.out.println("3) Años experiencia");
					System.out.println("4) Cantidad de lenguajes");
					System.out.println("5) Por ID");
					
					opcionUnoAdmin = scanner.nextLine();
					
				}
				
				switch (opcionUnoAdmin) {
				
					case "1":
						
						mostrarProgramadoresPorPais(contenedorPaisesRegiones, contenedorProgramadores);
						break;
						
					case "2":
						
						mostrarProgramadoresPorCiudad(contenedorPaisesRegiones, contenedorProgramadores);
						break;
						
					case "3":
						
						mostrarProgramadoresPorAñosExperiencia();
						break;
						
					case "4":
						
						mostrarProgramadoresPorCantLenguajes();
						break;
						
					case "5":
						
						mostrarProgramadoresPorID();
						break;

				}
				
				break;
				
			case "2":
				
				System.out.println("------------ Ver Por ------------------");
				System.out.println("1) Tipo");
				System.out.println("2) Nombre");
				System.out.println("3) Presición");
				System.out.println("4) País");
				System.out.println("5) Nivel de peligrosidad");
				
				String opcionDosAdmin = scanner.nextLine();
				
				while(!opcionDosAdmin.equals("1") && !opcionDosAdmin.equals("2") && !opcionDosAdmin.equals("3") &&
						!opcionDosAdmin.equals("4") && !opcionDosAdmin.equals("5")) {
					
					System.out.println("------------ Ver Por ------------------");
					System.out.println("1) Tipo");
					System.out.println("2) Nombre");
					System.out.println("3) Presición");
					System.out.println("4) País");
					System.out.println("5) Nivel de peligrosidad");
					
					opcionDosAdmin = scanner.nextLine();
					
				}
				
				switch (opcionDosAdmin) {
				
				case "1":
					
					mostrarIAPorTipo();
					
					break;
					
				case "2":
					
					mostrarIAPorNombre();
					break;
					
				case "3":
					
					mostrarIAPorPresicion();
					break;
					
				case "4":
					
					mostrarIAPorPais();
					break;
					
				case "5":
					
					mostrarIAPorNivelDePeligrosidad();
					break;

			}
				
				
				break;
			
			case "3":
				
				editarDatosProgramador();
				
				break;

			case "4":
				
				editarDatosIA();
				
				break;

			case "5":
				
				editarDatosDeUsuarioAdmin();
					
				break;
				
			case "6":
				
				crearVisualizarDebilidades();
				
				break;
				
			case "7":
				
				crearIAProgramador();
				
				break;

			case "8":
				
				System.out.println("------------ Ver Por ------------------");
				System.out.println("1) Porcentaje de IA y programadores por países según el total");
				System.out.println("2) Porcentaje de IA y programadores por Ciudad según el total ");
				
				String opcionOchoAdmin = scanner.nextLine();
				
				while(!opcionOchoAdmin.equals("1") && !opcionOchoAdmin.equals("2")) {
					
					System.out.println("------------ Ver Por ------------------");
					System.out.println("1) Porcentaje de IA y programadores por países según el total");
					System.out.println("2) Porcentaje de IA y programadores por Ciudad según el total ");
					
					opcionDosAdmin = scanner.nextLine();
					
				}
				
				switch (opcionOchoAdmin) {
				
					case "1":
					
						porcentajePorPais();
						break;
					
					case "2":
					
						porcentajePorCiudad();
						break;
					
				}
				
				
				break;
			
			}
			
		}else {
			System.out.println("--------------Menu normal---------------");
			System.out.println("Seleccione la opcion que desea realizar: ");
			System.out.println("1) Agregar una debilidad a la Ia");
			System.out.println("2) Modificar datos usuario");
			System.out.println("3) Modificar Precisión de una IA");
			System.out.println("4) Ver IAs");
			System.out.println("5) Ver Tipos de IA");
			
			String opcionMenuNormal = scanner.nextLine();
			
			while(!opcionMenuNormal.equals("1") && !opcionMenuNormal.equals("2") && !opcionMenuNormal.equals("3") &&
					!opcionMenuNormal.equals("4") && !opcionMenuNormal.equals("5")) {
					System.out.println("---------------Opcion no valida, ingrese una opcion de las que se le muestran: ---------------");
					System.out.println("Seleccione la opcion que desea realizar: ");
					System.out.println("1) Agregar una debilidad a la Ia");
					System.out.println("2) Modificar datos usuario");
					System.out.println("3) Modificar Precisión de una IA");
					System.out.println("4) Ver IAs");
					System.out.println("5) Ver Tipos de IA");
					opcionMenuNormal = scanner.nextLine();
			}
			
			switch(opcionMenuNormal){
				
				case "1":
					
					opcionUnoMenuUsuarios(contenedorIas,contenedorProgramadores,contenedorDebilidades,idFinal);
					
					break;
					
				case "2":
					
					opcionDosMenuUsuarios(contenedorUsuarios, nombreFinal);
					
					break;
				
				//Revisar
				case "3":
					
					opcionTresMenuUsuarios(contenedorIas);
					
					break;
				//Revisar
				case "4":
					
					contenedorIas.mostrarIas();
					
					break;
				//Revisar
				case "5":
					
					opcionCincoMenuUsuarios(contenedorIas);
						
					break;
				
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

	
	private static void agregarPaisesAContenedores(contenedorPaises contPaisesRegiones) throws IOException {
		
		Scanner scan = new Scanner(new File("Países.txt"));

		while (scan.hasNextLine()) {
			
			String linea = scan.nextLine();
			
			Paises paisRegiones = new Paises(linea);
			contPaisesRegiones.agregarPaises(paisRegiones);
						
		}
		
	}


	private static void porcentajePorCiudad() {
		// TODO Auto-generated method stub
		
	}


	private static void porcentajePorPais() {
		// TODO Auto-generated method stub
		
	}


	private static void crearIAProgramador() {
		// TODO Auto-generated method stub
		
	}


	private static void crearVisualizarDebilidades() {
		// TODO Auto-generated method stub
		
	}


	private static void editarDatosDeUsuarioAdmin() {
		// TODO Auto-generated method stub
		
	}


	private static void editarDatosIA() {
		
	}


	private static void editarDatosProgramador() {
		// TODO Auto-generated method stub
		
	}


	private static void mostrarIAPorNivelDePeligrosidad() {
		// TODO Auto-generated method stub
		
	}


	private static void mostrarIAPorPais() {
		// TODO Auto-generated method stub
		
	}


	private static void mostrarIAPorPresicion() {
		// TODO Auto-generated method stub
		
	}


	private static void mostrarIAPorNombre() {
		// TODO Auto-generated method stub
		
	}


	private static void mostrarIAPorTipo() {
		// TODO Auto-generated method stub
		
	}


	private static void mostrarProgramadoresPorID() {
		// TODO Auto-generated method stub
		
	}


	private static void mostrarProgramadoresPorCantLenguajes() {
		// TODO Auto-generated method stub
		
	}


	private static void mostrarProgramadoresPorAñosExperiencia() {
		// TODO Auto-generated method stub
		
	}


	private static void mostrarProgramadoresPorCiudad(contenedorPaises contenedorPaisesRegiones, contenedorProgramadores contenedorProgramadores) {
		
		String[] ciudades = contenedorProgramadores.getCiudades().split(",");
		
		for (int i = 0;i<contenedorProgramadores.getCont();i++) {

			String ciudad = contenedorProgramadores.getCiudad(i);
			System.out.println(ciudad+": ");
			
			contenedorProgramadores.getPorCiudad(ciudad);
			
		}
		
	}


	private static void mostrarProgramadoresPorPais(contenedorPaises contenedorPaisesRegiones, contenedorProgramadores contenedorProgramadores) {
		
		for (int i = 0;i<contenedorPaisesRegiones.getCont();i++) {
			
			String pais = contenedorPaisesRegiones.mostrarPaises(i).getPais();
			System.out.println(pais+": ");
			
			contenedorProgramadores.getPorPais(pais);
			
		}
		
		
		
	}


	private static void guardarIas(contenedorIAAutoMilitar contenedorMilitar,contenedorIASupervisora contenedorSupervisora,contenedorIATranshumanista contenedorTranshumanista,
			contenedorIASocial contenedorSocial,contenedorIARealidadVirtual contenedorRv,contenedorIas contenedorIas) throws FileNotFoundException {
		
		
		Scanner scan = new Scanner(new File("IA.txt"));
		
		String nombreIa,lenguajeIa,debilidadIa,paisCreacionIa,tipoIa,presicionIa;
		int nivelAmenazaIa,idCreadorIa;
		
		while (scan.hasNextLine()){
			
			String[] partes = scan.nextLine().split(",");
			nombreIa = partes[0].strip();
			lenguajeIa = partes[1].strip();
			nivelAmenazaIa = Integer.parseInt(partes[2].strip());
			debilidadIa = partes[3].strip();
			paisCreacionIa = partes[4].strip();
			presicionIa = partes[5].strip();
			tipoIa = partes[6].strip();
			idCreadorIa = Integer.parseInt(partes[7].strip());
			
			Ias IA = new Ias(nombreIa,lenguajeIa,debilidadIa,paisCreacionIa,tipoIa,presicionIa,nivelAmenazaIa,idCreadorIa);
			
			
			switch(tipoIa.toLowerCase()) {
			
			case "ia autónoma militar":
				
				contenedorMilitar.agregarIa(IA);
				
				break;
			case "ia supervisora":
				
				contenedorSupervisora.agregarIa(IA);
				
				break;
			case "ia transhumanista":
				
				contenedorTranshumanista.agregarIa(IA);
				
				break;
			case "ia social":
				
				contenedorSocial.agregarIa(IA);
				
				break;
			case "ia de realidad virtual":
				
				contenedorRv.agregarIa(IA);
				
				break;
			}
			
			contenedorIas.agregarIas(IA);
		
		}
		

	}
	
	private static void guardarProgramadores(contenedorProgramadores contenedorProgramadores) throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File("Programadores.txt"));
		
		String nombre,apellido,pais,ciudad;
		String[] lenguajes;
		int id,añosExp;
		
		
		while (scan.hasNextLine()){
			
			String[] partes = scan.nextLine().split(",");
			int cantidadElementos = partes.length;
			id= Integer.parseInt(partes[0].strip());
			nombre = partes[1].strip();
			apellido = partes[2].strip();
			añosExp = Integer.parseInt(partes[3].strip());
			//Se crea un arreglo provicional donde se guardaran todos los lenguajes que domine el programador, el contador lo utilizaremos para saber de que
			//tamaño tiene que ser la lista final de los lenguajes
			int contador = 0;
			String[] listaAuxiliar = new String[400];
			for(int i =4;i<cantidadElementos-2;i++) {
				listaAuxiliar[contador]= partes[i].strip();
				contador+=1;
			}
			lenguajes = new String[contador];
			for(int j = 0;j<contador;j++) {
				lenguajes[j]=listaAuxiliar[j];
			}
			pais = partes[cantidadElementos-2].strip();
			ciudad = partes[cantidadElementos-1].strip();
			
			Programadores programador = new Programadores(id, nombre, apellido, añosExp, lenguajes, pais, ciudad);
			
			contenedorProgramadores.agregarProgramador(programador);
			
		}
		
	}
	
	public static void guardarUsuarios(contenedorUsuarios contenedorUsuarios) throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File("Usuarios.txt"));
		
		String nombreUsuario,contrasena;
		int idProgramador;
		
		while(scan.hasNextLine()) {
			String[] partes = scan.nextLine().split(",");
			nombreUsuario = partes[0].strip();
			contrasena = partes[1].strip();
			idProgramador = Integer.parseInt(partes[2].strip());			
		
			usuarios usuario = new usuarios(nombreUsuario, contrasena, idProgramador);
			
			contenedorUsuarios.agregarUsuario(usuario);
			
		}
		
		

	}
	
	
	//Esta funcion se encarga de retornar el tamaño de la fila del txt
		public static int tamañoFilas(String nombre)throws IOException {
			File archivo = new File(nombre);
			int cantidad = 1;
			Scanner leer = new Scanner(archivo);
			String linea = leer.nextLine();
			while(leer.hasNextLine()) {
				linea= leer.nextLine();
				cantidad += 1;
			}
			return cantidad;
		}
	
	///
		/////Hay que agregar a los usuarios y crear su contenedor para ellos
		////7
	////
		
		
	//Genera un numero random entre 0-9
	public static int random(int min,int max) {
	    return (int) Math.floor((Math.random() * (max - min + 1)) + min);
	}
	//Genera un numero random de 5 digitos
	public static int random5() {
		int p = random(0,9)*10000;
		int s = random(0,9)*1000;
		int t = random(0,9)*100;
		int c = random(0,9)*10;
		int q= random(0,9);
		return p+s+t+c+q;
	}
	
	public static boolean comprobarSiLenagujeExiste(String[] lista,String leng,int cant) {
		int j=0;
		while ( j< cant && !(lista[j].toUpperCase().equals(leng.toUpperCase()))) {
			j++;
		}
		if(j == cant) {
			return true;
		}
		return false;
	}


	public static void agregarDebilidades(contenedorDebilidades contenedor) throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File("Debilidades.txt"));
		
		String debilidad;
		int nivelAmenaza;
		
		while (scan.hasNextLine()){
			
			String[] partes = scan.nextLine().split(",");
			debilidad = partes[0].strip();
			nivelAmenaza = Integer.parseInt(partes[1].strip());
			
			debilidad debil = new debilidad(debilidad, nivelAmenaza);
			
			contenedor.agregarDebilidad(debil);
			
		}
	}
	
	
	public static void guardarDatosIas(String nombreArchivo,int filas,contenedorIas contenedorIas )throws IOException {
		FileWriter escribir;
		PrintWriter linea;
		File archivo = new File(nombreArchivo);
		
		escribir = new FileWriter(archivo,true);
		linea = new PrintWriter(escribir);
		BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
		bw.write("");
		for(int i=0;i<filas;i++) {
			linea.println(contenedorIas.getNombre(i)+", "+contenedorIas.getLenguaje(i)+", "+contenedorIas.getNivelAmenaza(i)+", "+contenedorIas.getDebilidad(i)
			+", "+contenedorIas.getPais(i)+", "+contenedorIas.getPrecision(i)+", "+contenedorIas.getTipo(i)+", "+contenedorIas.getIdCreador(i));
		}

		linea.close();
		escribir.close();
		bw.close();
	}
	
	public static void guardarDatosUsuarios(String nombreArchivo,int filas,contenedorUsuarios contenedorUsuarios) throws IOException {
		FileWriter escribir;
		PrintWriter linea;
		File archivo = new File(nombreArchivo);
		
		escribir = new FileWriter(archivo,true);
		linea = new PrintWriter(escribir);
		BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
		bw.write("");
		for(int i=0;i<filas;i++) {
			linea.println(contenedorUsuarios.getNombreUsuarioConAleatorio(i)+", "+contenedorUsuarios.getContrasena(i)+", "+
					contenedorUsuarios.getIdProgrmador(i));
		}

		linea.close();
		escribir.close();
		bw.close();
	}
	
	public static void guardarDatosProgramadores(String nombreArchivo,int filas,contenedorProgramadores contenedorProgramadores) throws IOException {
		FileWriter escribir;
		PrintWriter linea;
		File archivo = new File(nombreArchivo);
		
		escribir = new FileWriter(archivo,true);
		linea = new PrintWriter(escribir);
		BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
		bw.write("");
		for(int i=0;i<filas;i++) {
			linea.println(contenedorProgramadores.getId(i)+","+contenedorProgramadores.getNombre(i)+","+contenedorProgramadores.getApellido(i)+","+
					contenedorProgramadores.getAnosExperiencia(i)+","+contenedorProgramadores.getLenguajes(i)+contenedorProgramadores.getPais(i)+","+
					contenedorProgramadores.getCiudad(i));
		}

		linea.close();
		escribir.close();
		bw.close();
	}
	
	public static void opcionUnoMenuUsuarios(contenedorIas contenedorIas,contenedorProgramadores contenedorProgramadores,
			contenedorDebilidades contenedorDebilidades,int idFinal) throws NumberFormatException, IOException {
		Scanner scanner = new Scanner(System.in);
		int comprobadorExistenIas = 0;
		
		if(contenedorIas.revisarSiExistenIasSinDebilidades(comprobadorExistenIas) == 0) {
			System.out.println("No existen Ias sin debilidades");
		}else {
			contenedorIas.mostrarIasSinDebilidad();
			System.out.println("Ingrese el Id correspondiende a la Ia que desea modificar:");
			int idCreadorIngresado = Integer.parseInt(scanner.nextLine());
			while(contenedorIas.comprobarId(idCreadorIngresado)) {
				System.out.println("Id inexistente, ingrese uno valido");
				idCreadorIngresado = Integer.parseInt(scanner.nextLine());
		}

		if(!contenedorProgramadores.comprobarLenguaje(idFinal, contenedorIas.devolverLenguajeIa(idCreadorIngresado))) {
			System.out.println("No se puede modificar esta Ia debido a que el programador no maneja este lenguaje");
		}else {
			
			contenedorDebilidades.mostarDebilidadesSegunNivel(contenedorIas.devolverNivelAmenaza(idCreadorIngresado));
			System.out.println("Ingrese la debilidad que desea añadir");
			contenedorIas.getDebilidad(0);
			String debilidadAgregar = scanner.nextLine();
			contenedorIas.modificarDebilidad(debilidadAgregar, idCreadorIngresado);
			contenedorIas.getDebilidad(0);
		}
		
			
			guardarDatosIas("IA.txt",tamañoFilas("IA.txt") , contenedorIas);
			System.out.println("Funciona hasta ahora :D");
			
			
			
		}
	}
	
	public static void opcionDosMenuUsuarios(contenedorUsuarios contenedorUsuarios,String nombreFinal) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nuevo nombre de usuario: ");
		String nuevoNombreUsuario = scanner.nextLine();
		System.out.println("Ingrese nueva clave: ");
		String nuevaClaveUsuario = scanner.nextLine();
		
		System.out.println(nombreFinal);
		System.out.println("----------------");
		System.out.println(contenedorUsuarios.getNombreUsuario(1));
		System.out.println(contenedorUsuarios.getNombreUsuarioConAleatorio(1));
		System.out.println("-----------------------");
		contenedorUsuarios.cambiarNombreContrasena(nombreFinal, nuevoNombreUsuario, nuevaClaveUsuario);
		System.out.println("--------------------");
		System.out.println(contenedorUsuarios.getNombreUsuario(1));
		System.out.println(contenedorUsuarios.getNombreUsuarioConAleatorio(1));
		System.out.println(contenedorUsuarios.getContrasena(1));
		System.out.println("-----------------");
		
		guardarDatosUsuarios("Usuarios.txt",tamañoFilas("Usuarios.txt"),contenedorUsuarios);
	}

	public static void opcionTresMenuUsuarios(contenedorIas contenedorIas) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		contenedorIas.mostrarIas();
		System.out.println("Ingrese el id correspodiente");
		int idCreadorIa= Integer.parseInt(scanner.nextLine());
		while(contenedorIas.comprobarId(idCreadorIa)) {
			System.out.println("Id no valida, ingrese una id valida");
			idCreadorIa= Integer.parseInt(scanner.nextLine());
		}
		System.out.println("Ingrese el nuevo porcentaje de precision(sin % y que no supere el 100%): ");
		int nuevaPrecision = Integer.parseInt(scanner.nextLine());
		while(nuevaPrecision >100 && nuevaPrecision < 1) {
			System.out.println("El numero ingresado no es valido, ingrese uno nuevo:");
			nuevaPrecision = Integer.parseInt(scanner.nextLine());
		}
		contenedorIas.modificarPorcentajePrecision(nuevaPrecision, idCreadorIa);
		
		guardarDatosIas("IA.txt",tamañoFilas("IA.txt") , contenedorIas);
		System.out.println(contenedorIas.getPrecision(1));
	}
	
	public static void opcionCincoMenuUsuarios(contenedorIas contenedorIas) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("-------------Los tipos de Ias son--------------");
		System.out.println("IA autónoma militar");
		System.out.println("IA supervisora");
		System.out.println("IA transhumanista");
		System.out.println("IA social");
		System.out.println("IA de realidad virtual");
		System.out.println("Ingrese el tipo de Ia que desea ver: ");
		String tipoIaIngresado = scanner.nextLine();
		while(!tipoIaIngresado.toUpperCase().equals("IA AUTÓNOMA MILITAR") && !tipoIaIngresado.toUpperCase().equals("IA SUPERVISORA")&&
				!tipoIaIngresado.toUpperCase().equals("IA TRANSHUMANISTA")&&!tipoIaIngresado.toUpperCase().equals("IA SOCIAL")&&
				!tipoIaIngresado.toUpperCase().equals("IA DE REALIDAD VIRTUAL")) {
			System.out.println("Opcion no valida, ingrese una valida por favor");
			tipoIaIngresado = scanner.nextLine();
		}
		contenedorIas.mostrarTipoIa(tipoIaIngresado);
	}
}
