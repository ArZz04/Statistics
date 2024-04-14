import java.util.ArrayList;
import java.util.List;

public class DataSet {
    private float x[];

    public DataSet(){
        ReaderCSV reader = new ReaderCSV();
        x = reader.getX();
    }

    public float[] getX() {
        return this.x;
    }
}