package Taller2;

import java.io.File;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		guardarIas();
		
	}

	private static void guardarIas() {
		
		Scanner scan = new Scanner(new File("IA.TXT"));
		
		String nombreIa,lenguajeIa,debilidadIa,paisCreacionIa,tipoIa,presicionIa;
		int nivelAmenazaIa,idCreadorIa;
		
		while (scan.hasNextLine()){
			
			String[] partes = scan.nextLine().split(",");
			nombreIa = partes[0];
			lenguajeIa = partes[1];
			nivelAmenazaIa = Integer.parseInt(partes[2]);
			debilidadIa = partes[3];
			paisCreacionIa = partes[4];
			presicionIa = partes[5];
			tipoIa = partes[6];
			idCreadorIa = Integer.parseInt(partes[7]);
			
			Ias IA = new Ias(nombreIa,lenguajeIa,debilidadIa,paisCreacionIa,tipoIa,presicionIa,nivelAmenazaIa,idCreadorIa);
			
			switch(tipoIa) {
			
			case "IA autónoma militar":
				Ias.agregarIaAutonomaMilitar(IA);
			
			}
				
		}
		
		
	}
	
	
	
}
