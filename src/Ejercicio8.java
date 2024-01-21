import java.util.Scanner;

public class Ejercicio8 {

    public static String convierteEnPalabras(int n){
        String ncadena = String.valueOf(n);
        String aux = "";
        String result = "";

        for (int i=0; i<ncadena.length();i++){
            switch (ncadena.charAt(i)){
                case '1': aux = "uno"; break;
                case '2': aux = "dos"; break;
                case '3': aux = "tres"; break;
                case '4': aux = "cuatro"; break;
                case '5': aux = "cinco"; break;
                case '6': aux = "seis"; break;
                case '7': aux = "siete"; break;
                case '8': aux = "ocho"; break;
                case '9': aux = "nueve"; break;
                case '0': aux = "cero"; break;
            }

            result += aux;
            if (i < ncadena.length() -1){
                result += ", ";
            }
        }

        return result;
    }

    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Escribe un número");
        int n = reader.nextInt();

        System.out.println(convierteEnPalabras(n));
    }
}
