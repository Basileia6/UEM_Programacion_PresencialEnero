import  java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la altura");

        int altura = scanner.nextInt();

        int largo = (altura/2)+1;

        for (int i = 1;i <=altura;i++){
            if (i <altura){
                System.out.println("*");
            }
            else {
                for (int j=1;j <=largo;j++){
                    System.out.print("*");
                }
            }
        }

    }
}
