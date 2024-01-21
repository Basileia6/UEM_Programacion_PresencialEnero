import java.util.Calendar;

public class Ejercicio2B {

    public static void main (String[] args){

        Calendar c = Calendar.getInstance();

        int hora = c.get(11);//El 11 hace referencia a la hora según la definición del array del calendario
        System.out.println(hora);

        if (hora >= 6 && hora <=12){
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <=20) {
            System.out.println("Buenas tardes");
        } else{
            System.out.println("Buenas noches");
        }
    }
}
