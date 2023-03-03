package PuntoSiete;
import java.util.Scanner;

public class Pintura {
	
	public Scanner in;
	
	public void BotesPintura() {
		
		in = new Scanner(System.in);
        double largo, ancho, alto;
        int cuboCincoL, cuboUnL;
        
        System.out.print("Ingrese la altura: ");
        alto = in.nextDouble();
        System.out.print("Ingrese el largo: ");
        largo = in.nextDouble();
        System.out.print("Ingrese el ancho: ");
        ancho = in.nextDouble();
        double area = 2*alto*(largo+ancho);
        System.out.println("\nArea de la habitacion: "+area);
        
        cuboCincoL = (int)(area/1500);
        cuboUnL = (int)((area%1500)/300);

		if((area%1500)%300>0)
            cuboUnL++;

        System.out.println("Cubos de 5 litros: "+cuboCincoL);
        System.out.println("Cubos de 1 litro: "+cuboUnL);

		
        
	}

		
	}


