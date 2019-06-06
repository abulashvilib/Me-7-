import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class OutputLuwi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("output.txt"));
        int i = 1;
        String output;
        while ((output = br.readLine()) != null) {
            if(i%2==0){
                System.out.println(output);
            }
            i++;
        }
    }
}
