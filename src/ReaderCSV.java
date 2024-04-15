import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderCSV {

    private float[] x;

    public ReaderCSV() {
        String path = "./data/tickets.csv";
        String line;
        int counter = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // Count the lines in the file to determine the size of the array
            int lineCount = 0;
            while (br.readLine() != null) {
                lineCount++;
            }

            // Initialize the array with the appropriate size
            x = new float[lineCount];

            // Reset the buffered reader to read from the beginning of the file
            br.close();
            BufferedReader bR = new BufferedReader(new FileReader(path));

            // Column 'AMOUNT'
            int dataToGet = 7;

            while ((line = bR.readLine()) != null) {

                // Correct dataset values
                String[] values = line.split(",");
                String amountStr = values[dataToGet].replace("\"", "");
                float amount = Float.parseFloat(amountStr);

                // Add values to the dataset
                x[counter] = amount;

                counter++;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public float[] getX() {
        return x;
    }
}