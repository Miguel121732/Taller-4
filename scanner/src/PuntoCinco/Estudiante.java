package PuntoCinco;
import java.util.Scanner;

public class Estudiante {
	
	public Scanner in;
	
	public void requisitos() {
		in = new Scanner(System.in);
		boolean instituto = false;
		int alumnos = 1200;
		boolean aceptado = false;
			
		
		System.out.println("Fuiste estudiante del instituto con la nota mas alta:");
		String rol = in.next();
		
		System.out.println("Ingrese su nota");
		int nota = in.nextInt();
		
		System.out.println("Ingrese su puntaje SAT");
		int sat = in.nextInt();
		
		if(instituto && alumnos >=1400)
		        aceptado = true;
		else if (nota >= 4.0 && sat >= 1100)
				aceptado = true;
		else if (nota >= 3.5 && sat >= 1300)
				aceptado = true;
		else if (nota >= 3.0 && sat >= 1500)
			    aceptado = true;
		
		if (aceptado)
			System.out.println("Felicitaciones usted ha sido aceptado");
		else {
			System.out.println("Lamentamos informarle que no ha sido aceptado");
		}
		
		
	}

}
