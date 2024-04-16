public class Main {
    public static void main(String[] args) {
        DataSet DS = new DataSet();

        int[] f = {  };
        int[] dotHalf = { /* valores de punto medio */ };
        int[] Cfre = { /* valores de frecuencia acumulada */ };
        int[] fAcu = { /* valores de frecuencia relativa */ };
        int[] fRel = { /* valores de frecuencia relativa acumulada */ };
        int[] fRelAcu = { /* valores de porcentaje */ };
        int[] x = { /* valores de las clases */ };

        // Llama a la función printTable y pasa los arreglos como argumentos
        Functions.printTable(f, dotHalf, Cfre, fAcu, fRel, fRelAcu, x);
    }

}