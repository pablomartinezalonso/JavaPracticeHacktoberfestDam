import java.util.Scanner;

public class ejerjoven {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int edad;
		int nivel_de_estudios;
		int ingresos;
		boolean jasp=false;
		
		System.out.println ("Por favor introduzca su edad:");
		edad= sc.nextInt();
		
		System.out.println ("Por favor introduzca su nivel de estudios:");
		nivel_de_estudios= sc.nextInt();

		System.out.println ("Por favor introduzca sus ingresos:");	
		ingresos= sc.nextInt();
		
		jasp = ((edad <= 28) && (nivel_de_estudios > 3) && (ingresos > 28000));
		// JASP-> Joven Aunque Sobradamente Preparado
		System.out.println("CHAVAL TU JASP ES: " +jasp);
		
	}

}
