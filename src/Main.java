import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crear una instancia de la clase DataSet y agregar los montos
        DataSet DS = new DataSet();

        // Imprimir el valor de x
        System.out.println("Valores de x: ");
        for (float value : DS.getX()) {
            System.out.println(value);
        }

    }
}