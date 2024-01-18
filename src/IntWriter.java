import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

public class IntWriter extends ArrayProcessor{
    static long numOfInt=0;
    static BigInteger sumInteger=new BigInteger("0");
    static BigInteger averageValue=new BigInteger("0");
    static Long minValue=Long.MAX_VALUE;
    static Long maxValue=Long.MIN_VALUE;
        public static void write(ArrayList<ArrayList<String>> strokesArray,String[] pathes){
            try{
                File file = new File(pathes[0]);
                if(!file.exists()){
                    file.createNewFile();
                }
            }
            catch (IOException e){
                System.out.println(e.getMessage());

            }


                try(FileWriter writer = new FileWriter(pathes[0], Main.getAppendIt()))
                {
                    for(ArrayList<String> i:strokesArray) {
                        for (String j : i) {
                            if(isInteger(j)){
                                writer.write(j +"\n");
                                numOfInt++;
                                BigInteger temp = new BigInteger(j);
                                sumInteger=sumInteger.add(temp);
                                minValue=Math.min(Long.parseLong(j), minValue);
                                maxValue=Math.max(Long.parseLong(j), maxValue);
                            }
                        }
                    }
                    averageValue=sumInteger.divide(BigInteger.valueOf(numOfInt));
                }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }

}
