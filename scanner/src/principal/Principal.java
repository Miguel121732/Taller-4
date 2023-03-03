package principal;
import puntoUno.PuntoUno;
import PuntoDos.puntoDos;
import PuntoCuatro.Peso;
import PuntoCinco.Estudiante;
import PuntoSeis.ExamenFinal;
import PuntoSiete.Pintura;


public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("Punto Uno");
		PuntoUno pu = new PuntoUno();
		pu.operador();
		
		System.out.println("\nPunto Dos");
		puntoDos pd = new puntoDos();
		pd.calculadora();
		
		System.out.println("\nPunto Cuatro");
		Peso pe = new Peso();
		pe.calcularMasa();
		
		System.out.println("\nPunto Cinco");
		Estudiante est = new Estudiante();
		est.requisitos();
		
		System.out.println("\nPunto Seis");
		ExamenFinal ef = new ExamenFinal();
		ef.examen();
		
		System.out.println("\nPunto Siete");
		Pintura pi = new Pintura();
		pi.BotesPintura();
		
	}

}
