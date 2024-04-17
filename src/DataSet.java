
public class DataSet {
    private float[] x;
    private float[] xOrdered;

    public DataSet(){

        //x = new float[] {70, 92, 43, 85, 78, 97, 66, 72, 55, 83, 94, 50, 52, 89, 35, 40, 46, 79, 34, 41, 60, 58, 73, 95, 39, 80, 71, 63, 93, 76, 82, 96, 31, 81, 90, 67, 74, 61, 98, 87, 65, 88, 99, 69};

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