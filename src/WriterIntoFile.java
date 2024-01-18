import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriterIntoFile {
    public static void Write(ArrayList<ArrayList<String>> allStrokes){
        try(FileWriter writer = new FileWriter("notes3.txt", Main.getAppendIt()))
        {

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
