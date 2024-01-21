import java.util.Scanner;
import java.lang.Math;

public class Ejercicio1 {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca el radio");
        int r = reader.nextInt();
        System.out.println("Introduzca la altura");
        int h = reader.nextInt();

        double result = (Math.PI*Math.pow(r,2)*h)/3;

        System.out.println("El volumen del cono con los parámetros elegidos es: "+result);

    }
}
