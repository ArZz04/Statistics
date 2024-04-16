import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        DataSet DS = new DataSet();

        /*
        int n = 0;
        // Imprimir el valor de x
        System.out.println("Valores de x: ");
        for (float value : DS.getX()) {
            n++;
            System.out.println(n + " " + value);
        }
        */

        System.out.println("Clases a hacer: " + Functions.clasesSturges());
        System.out.println("Rango de clases: " + Functions.range());
        System.out.println("Intervalo de clases: " + Functions.interval());
    }
}