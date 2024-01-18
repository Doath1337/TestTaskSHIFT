import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class StringWriter extends ArrayProcessor{
    static int numOfStrings=0;
    static int minLength=Integer.MAX_VALUE;
    static int maxLength=0;
    public static void write(ArrayList<ArrayList<String>> strokesArray,String[] pathes){

        try{
            File file = new File(pathes[2]);
            if(!file.exists()){
                file.createNewFile();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());

        }

        try(FileWriter writer = new FileWriter(pathes[2], Main.getAppendIt()))
        {
            for(ArrayList<String> i:strokesArray) {
                for (String j : i) {
                    if(isString(j) && !j.isEmpty()){
                        writer.write(j+"\n");
                        numOfStrings++;
                        minLength=Math.min(j.length(), minLength);
                        maxLength=Math.max(j.length(), maxLength);
                    }
                }
            }

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}
