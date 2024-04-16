
public class DataSet {
    private float[] x;
    private float[] xOrdered;

    public DataSet(){
        ReaderCSV reader = new ReaderCSV();
        x = reader.getX();
    }

    public float[] getX() {
        return this.x;
    }

    public void setXOrdered(float[] xOrdered) {
        this.xOrdered = xOrdered;
    }

    public float[] getXOrdered() {
        this.xOrdered = Functions.matchSort(this.x);
        return this.xOrdered;
    }
}