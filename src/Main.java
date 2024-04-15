import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crear una instancia de la clase DataSet y agregar los montos
        DataSet DS = new DataSet();
        int n = 0;
        // Imprimir el valor de x
        System.out.println("Valores de x: ");
        for (float value : DS.getX()) {
            n++;
            System.out.println(n + " " + value);
        }

    }
}