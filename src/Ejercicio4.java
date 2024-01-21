import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String jug1 = "";
        String jug2 = "";

        do {
            System.out.println("Introduce una opción correcta");
            System.out.println("Turno del jugador 1 (introduzca Piedra, Papel o Tijera):");
            jug1 = reader.next();
        } while (!jug1.equals("Piedra") && !jug1.equals("Papel") && !jug1.equals("Tijera"));

        do {
            System.out.println("Introduce una opción correcta");
            System.out.println("Turno del jugador 2 (introduzca Piedra, Papel o Tijera):");
            jug2 = reader.next();
        } while (!jug2.equals("Piedra") && !jug2.equals("Papel") && !jug2.equals("Tijera"));


        if(jug1.equals(jug2)){
            System.out.println("Empate");
        } else if ((jug1.equals("Piedra") && jug2.equals("Papel")) || (jug1.equals("Papel") && jug2.equals("Tijera")) || (jug1.equals("Tijera") && jug2.equals("Piedra"))){
            System.out.println("Gana jugador 2");
            } else {
            System.out.println("Gana jugador 1");
        }
    }
}
