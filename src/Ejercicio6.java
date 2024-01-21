import java.util.Scanner;

public class Ejercicio6 {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        int num = 0;
        double cont = 0.0;
        int suma = 0;

        do{
            System.out.println("Introduza un número");
            num = reader.nextInt();

            if (num > 0){
                suma += num;
                cont ++;
            }

        }while (num > 0);

        double media = suma/cont;

        System.out.println("Ha introducido "+(int)cont+" números, cuya media es " + media);

    }
}
