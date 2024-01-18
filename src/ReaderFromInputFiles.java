import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderFromInputFiles {
    public static ArrayList<ArrayList<String>> read(ArrayList<String> path){
        String stroke;
        int numOfLine;
        for(int i =0;i< path.size();i++){
            path.set(i,System.getProperty("user.dir")+"\\"+path.get(i));
        }
        ArrayList<ArrayList<String>> allStrokesFromFiles = new ArrayList<ArrayList<String>>();
        for (int i =0;i<path.size();i++){
            numOfLine=0;
            try(BufferedReader reader = new BufferedReader(new FileReader(path.get(i))))
            {
                while((stroke=reader.readLine())!=null){
                    if(numOfLine>= allStrokesFromFiles.size()){
                        allStrokesFromFiles.add(new ArrayList());
                    }
                    if (allStrokesFromFiles.get(numOfLine).size()==i){
                        allStrokesFromFiles.get(numOfLine).add(i,stroke);
                    }
                    else{
                        for(int j =allStrokesFromFiles.get(numOfLine).size();j<i;j++){
                            allStrokesFromFiles.get(numOfLine).add("");
                        }
                        allStrokesFromFiles.get(numOfLine).add(i,stroke);
                    }
                    numOfLine++;
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
                ErrorHandler.errorHandling(1);
            }
        }

        return allStrokesFromFiles;
    }


}
