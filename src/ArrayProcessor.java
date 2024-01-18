import java.util.ArrayList;


public class ArrayProcessor {


    public static void process(ArrayList<ArrayList<String>> strokesArray,String[] pathes){
         boolean stringIsHere=false;
         boolean intIsHere=false;
         boolean doubleIsHere=false;
       for(ArrayList<String> i:strokesArray){
           for(String j:i){
               if(isString(j) && stringIsHere==false){
                   stringIsHere=true;
               }
               else if(isDouble(j)&& doubleIsHere==false){
                   doubleIsHere=true;
               } else if (isInteger(j)&& intIsHere==false){
                   intIsHere=true;
               }
               else{
                   break;
               }
           }
           if(stringIsHere && intIsHere && doubleIsHere){
               break;
           }
       }
       if(stringIsHere){
           StringWriter.write(strokesArray,pathes);
       }
       if(intIsHere){
           IntWriter.write(strokesArray,pathes);
       }
       if(doubleIsHere){
           DoubleWriter.write(strokesArray,pathes);
       }

    }
    public static boolean isString(String stroke){
        return !(isDouble(stroke) || isInteger(stroke));
    }
    public static boolean isDouble(String stroke){
        try{
            if(!isInteger(stroke)){
                Double.parseDouble(stroke);
                return true;
            }
            return false;
        }
        catch (NumberFormatException e){
            return false;
        }

    }
    public static boolean isInteger(String stroke){
        try{
            Long.parseLong(stroke);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

}
