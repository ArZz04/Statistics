import java.util.Arrays;

public class Functions {

    private static int k = 0;
    private static int r = 0;
    private static int c = 0;

    public static float[] matchSort(float[] x) {
        DataSet DS = new DataSet();

        float[] xOrdered = DS.getX();
        Arrays.sort(xOrdered);

        return DS.setXOrdered(xOrdered);
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


    public static void printTable(int[] f, int[] dotHalf, int[] Cfre, int[] fAcu, int[] fRel, int[] fRelAcu, int[] x) {
        System.out.println("-------------------------------------------------");
        System.out.println("Clase | Frecuencia | Punto Medio | Frecuencia Acumulada | Frecuencia Relativa | Frecuencia Relativa Acumulada | Porcentaje" );
        for (int i = 0; i < f.length; i++) {
            System.out.printf("%5d | %10d | %12d | %20d | %19d | %29d | %10d%n", x[i], f[i], dotHalf[i], Cfre[i], fAcu[i], fRel[i], fRelAcu[i]);
        }
        System.out.println("-------------------------------------------------");
    }

}
