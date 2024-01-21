import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio7 {

    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);
        int[] numeros = new int[100];
        List<Integer> ordenados = new ArrayList<>();

        for (int i=0;i<100;i++){
            int num = (int)(Math.random() * 501);
            numeros[i] = num;
            ordenados.add(num);
        }

        Collections.sort(ordenados);

        int cont = 0;

        for (int i=0;i<100;i++){
            System.out.print("  "+numeros[i]+"  ");
            cont++;
            if (cont == 20){
                System.out.println();
                cont = 0;
            }
        }

        System.out.println("¿Qué quiere destacar? (1 – mínimo, 2 – máximo):");
        int opcion = reader.nextInt();

        if (opcion == 1){
            for (int i=0;i<100;i++){
                if (numeros[i] == ordenados.getFirst()) {
                    System.out.print("  **" + numeros[i] + "**  ");
                }
                else{
                    System.out.print("  "+numeros[i]+"  ");
                }
                cont++;
                if (cont == 20){
                    System.out.println();
                    cont = 0;
                }
            }
        }
        else if (opcion ==2){
            for (int i=0;i<100;i++){
                if (numeros[i] == ordenados.getLast()) {
                    System.out.print("  **" + numeros[i] + "**  ");
                }
                else{
                    System.out.print("  "+numeros[i]+"  ");
                }
                cont++;
                if (cont == 20){
                    System.out.println();
                    cont = 0;
                }
            }
        }else{
            System.out.println("No se ha elegido una opción correcta");
        }


    }
}
