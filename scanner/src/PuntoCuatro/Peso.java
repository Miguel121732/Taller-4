package PuntoCuatro;
import java.util.Scanner;

public class Peso {
	
	public Scanner in;
	
	public void calcularMasa() {
		in = new Scanner(System.in);
		double peso;
		int numeroPlaneta;
		System.out.println("Ingrese tu peso en la tierra: ");
		peso = in.nextDouble();
		
		System.out.println("Ingresa el numero de uno de los siguientes planetas:"
		           +"\n"
		           +"(1) Mercurio" + "\n"
		           +"(2) Venus" + "\n"
		           +"(3) Marte" + "\n"
		           +"(4) Jupiter" + "\n"
		           +"(5) Saturno" + "\n"
		           +"(6) Urano" + "\n"
		           +"(7) Neptuno" + "\n"
		          	);
		
		numeroPlaneta = in.nextInt();
		double Conversion;
		switch (numeroPlaneta) {
		
		case 1:
			Conversion = peso * 0.38;
			System.out.println("Tu peso en Mercurio es: " + Conversion);
			break;
		case 2:
			Conversion = peso * 0.91;
			System.out.println("Tu peso en Venus es: " + Conversion);
			break;
		case 3:
			Conversion = peso * 0.38;
			System.out.println("Tu peso en Marte es: " + Conversion);
			break;
		case 4:
			Conversion = peso * 2.36;
			System.out.println("Tu peso en Jupiter es: " + Conversion);
			break;
		case 5:
			Conversion = peso * 0.92;
			System.out.println("Tu peso en Saturno es: " + Conversion);
			break;
		case 6:
			Conversion = peso * 0.89;
			System.out.println("Tu peso en Urano es: " + Conversion);
			break;
		case 7:
			Conversion = peso * 1.13;
			System.out.println("Tu peso en Neptuno es: " + Conversion);
			break;
			
		}
	}

}
