package PuntoDos;
import java.util.Scanner;


public class puntoDos {
	
	public Scanner in;
	
	public void calculadora() {
		in = new Scanner(System.in);
		double resultado = 0;
		
		System.out.println("Ingrese un numero:" );
		double num1 = in.nextDouble();
		System.out.println("Ingrese otro numero:" );
		double num2 = in.nextDouble();
		System.out.println("Ingrese un operador (*,+,/,%,+,-):");
		char op = in.next().charAt(0);
		
		
		
		if(op == '*')
			resultado = num1 * num2;
		else if(op == '/')
			resultado = num1 / num2;
		else if(op == '%')
			resultado = num1 % num2;
		else if(op == '+')
			resultado = num1 + num2;
		else if(op == '-')
			resultado = num1 - num2;
		else
			System.out.println("comando invalido");
		System.out.println("El resultado es: "+ resultado);
		
		
	}
	
	

}
