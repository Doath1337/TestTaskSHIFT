import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class DoubleWriter extends ArrayProcessor{
    static int numOfDouble=0;
    static BigDecimal sumDouble=new BigDecimal("0.0");
    static BigDecimal averageValue=new BigDecimal("0.0");
    static BigDecimal minValue=new BigDecimal("9e30");
    static BigDecimal maxValue=new BigDecimal("9e-30");
    public static void write(ArrayList<ArrayList<String>> strokesArray,String[]pathes){
        try{
            File file = new File(pathes[1]);
            if(!file.exists()){
                file.createNewFile();
            }
        }
        catch (IOException e){
            System.out.println("ERROR");
        }
        try(FileWriter writer = new FileWriter(pathes[1], Main.getAppendIt()))
        {
            for(ArrayList<String> i:strokesArray) {
                for (String j : i) {
                    if(isDouble(j)){
                        writer.write(j+"\n");
                        numOfDouble++;
                        BigDecimal temp = new BigDecimal(j) ;
                        sumDouble=sumDouble.add(temp);
                        minValue=temp.min(minValue);
                        maxValue=temp.max(maxValue);
                    }
                }
            }
            averageValue=sumDouble.divide(BigDecimal.valueOf(numOfDouble),4, RoundingMode.HALF_UP);
        }
        catch(IOException e){
            System.out.println(e.getMessage());

        }
    }
}
