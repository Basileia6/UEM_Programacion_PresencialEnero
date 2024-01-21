import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen");
        double examen = scanner.nextDouble();

        System.out.println("Cual es la nota que quieres sacar");
        double nota = scanner.nextDouble();

        double result = ((nota*100)-(examen*40))/60;

        System.out.println("Para tener un "+nota+" en el trimestre necesitas sacar un "+result+" en el segundo examen");

    }
}
