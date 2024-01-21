import java.util.Scanner;

public class Ejercicio2 {

    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);

        //También se podría hacer con la hora del sistema a través de la clase Calendar

        System.out.println("Introduzca que hora es en formato 24 horas");
        int hora = reader.nextInt();

        if (hora >= 6 && hora <=12){
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <=20) {
            System.out.println("Buenos tardes");
        } else{
            System.out.println("Buenos noches");
        }
    }
}
