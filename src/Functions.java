import java.util.Arrays;

public class Functions {

    private static int k = 0;
    private static int r = 0;
    private static int c = 0;


    static DataSet DS = new DataSet();
    static float[] x = DS.getXOrdered();

    static int numClasses = Sturges(); // Obtener el número de clases
    static int n = x.length;

    static float[] classLimits = calculateClassLimits(x, numClasses);
    static int[] cumulativeFrequencies = new int[numClasses];
    static float[] midPoints = new float[numClasses];


    public static float[] matchSort(float[] x) {
        DataSet DS = new DataSet();

        float[] xOrdered = Arrays.copyOf(x, x.length);
        Arrays.sort(xOrdered);

        DS.setXOrdered(xOrdered);

        return xOrdered;
    }

    public static int Sturges(){
        DataSet DS = new DataSet();
        float[] x = DS.getXOrdered();

        int n = x.length;
        k = (int) Math.ceil(1 + 3.322 * Math.log10(n));

        return k;
    }

    public static int range(){
        DataSet DS = new DataSet();
        float[] x = DS.getXOrdered();

        int n = x.length;
        float range = x[n-1] - x[0];
        r = (int) Math.ceil(range / Sturges());

        return r;
    }

    public static int interval() {
        c = r/k;
        return c;
    }


    // ------------------------------------------------------------

    public static int[] frequency() {
        DataSet DS = new DataSet();
        float[] x = DS.getXOrdered();
        int n = x.length;
        int numClasses = Sturges();

        int[] frequencies = new int[numClasses];
        //Defines los limites de la classLimits
        float[] classLimits = calculateClassLimits(x, numClasses);

        // Contar la frecuencia de cada intervalo de clase
        for (int i = 0; i < n; i++) {
            float dataPoint = x[i];
            for (int j = 0; j < numClasses; j++) {
                if (dataPoint >= classLimits[j] && dataPoint < classLimits[j + 1]) {
                    frequencies[j]++;
                    break; // Salir del bucle una vez que se haya asignado la frecuencia
                }
            }
        }

        return frequencies;
    }

    // Función para calcular los límites de clase
    private static float[] calculateClassLimits(float[] data, int numClasses) {
        float min = data[0];
        float max = data[data.length - 1];
        float interval = (max - min) / numClasses;
        float[] classLimits = new float[numClasses + 1];
        classLimits[0] = min;
        for (int i = 1; i < numClasses; i++) {
            classLimits[i] = min + i * interval;
        }
        classLimits[numClasses] = max;
        return classLimits;
    }

    // ------------------------------------------------------------

    public static void printTable() {
        System.out.println("-------------------------------------------------");
        System.out.println("N. Clase |      Clase      | Frecuencia | Punto Medio | Frecuencia Acumulada | Frecuencia Relativa | Frecuencia Relativa Acumulada | Porcentaje");

        int iClases = n / numClasses;

        // Calcular la frecuencia de cada clase
        int[] frequencies = frequency();

        int cumulativeFrequency = 0;

        for (int i = 0; i < numClasses; i++) {
            int startIndex = i * iClases; // Calcular el índice de inicio del intervalo
            int endIndex = (i + 1) * iClases - 1; // Calcular el índice de fin del intervalo

            // Manejar el último intervalo
            if (i == numClasses - 1) {
                endIndex = n - 1;
            }

            // Calcular el punto medio
            midPoints[i] = (classLimits[i] + classLimits[i + 1]) / 2;

            // Calcular la frecuencia acumulada
            cumulativeFrequency += frequencies[i];
            cumulativeFrequencies[i] = cumulativeFrequency; // Actualizar la frecuencia acumulada

            float cumulativeRelativeFrequency = (float) cumulativeFrequency / n;

            // Calcular el porcentaje basado en la frecuencia acumulada total
            float percent = ((float) frequencies[i] / n) * 100;

            System.out.printf(" " + (i + 1) + "  | %10d al %d | %10d | %12.2f | %20d | %18.4f | %30.4f | %10.2f%%\n",
                    (startIndex + 1), (endIndex + 1), frequencies[i], midPoints[i], cumulativeFrequencies[i],
                    (float) frequencies[i] / n, cumulativeRelativeFrequency, percent);
        }
    }
}
