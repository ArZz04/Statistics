import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderCSV {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "./data/ltickets.csv";
        String line = "";
        int counter = 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null){
                String[] values = line.split(",");
                System.out.println(values[0]);
                counter += 1;
            }

            System.out.println("-----------------------------------------");
            System.out.println("Son: " + counter + " tickets en el csv...");
        } catch (IOException e){
            System.out.println(e);
        }
    }
}