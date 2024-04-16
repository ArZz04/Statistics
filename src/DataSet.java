public class DataSet {
    private final float[] x;
    public double[] getXOrdered;
    private float[] xOrdered;

    public DataSet(){
        ReaderCSV reader = new ReaderCSV();
        x = reader.getX();
    }

    public float[] getX() {
        return this.x;
    }

    public float[] setXOrdered(float[] xOrdered){
        this.xOrdered = xOrdered;
        return xOrdered;
    }

    public float[] getXOrdered() {
        this.xOrdered = Functions.matchSort(this.x);
        return this.xOrdered;
    }
}