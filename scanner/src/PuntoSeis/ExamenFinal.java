package PuntoSeis;
import java.util.Scanner;

public class ExamenFinal {
	
	public Scanner lector;
	
	public void examen() {
		
		double promedio;
		int diasAusentes;
		boolean eximir=false;
		
		lector = new Scanner(System.in);
		System.out.println("Este programa determinara si puede salir del examen final.");
		System.out.println("Por favor, conteste a las siguientes preguntas:");
		System.out.println("¿Cual es tu promedio en la clase?");
		promedio = lector.nextDouble();
		System.out.println("¿Cuantas lecciones de clase te has perdido?");
		diasAusentes = lector.nextInt();
		
		//cuando hay mas de una sentencia if, se puede escribir de esta manera.
		if((promedio>= 90 && diasAusentes<= 3) || (promedio>= 80 && diasAusentes<= 0)) {
			
			eximir=true;
			
		}
		
		if(eximir)
			System.out.println("¡FELICITACIONES! estas exento del examen final");
		else
			System.out.println("Lo siento no estás exento del examen final");

	}

}
