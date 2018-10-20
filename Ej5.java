import java.util.Scanner;
 
public class Propuesto3 {
 
    public static void main(String[] args) {
         
        Scanner esc=new Scanner(System.in);
        int numero=0;
        int cuad=0;
         
        //entrada
        System.out.println("Introduzca el numero entero: ");
        numero=esc.nextInt();
         
        //logica
        cuad=(int) Math.pow(numero,2);
         
        //salida
        System.out.println("EL CUADRADO DE " + numero + " ES: " + cuad);
 
    }
 
}