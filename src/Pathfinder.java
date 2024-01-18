import java.io.File;

public class Pathfinder {

    public static String[] findOutputFilesPaths(){
        String[] names= new String[3];
        String[] stringPull=new String[3];;
        if(Main.getPrefix()){
            names[0] = File.separator + Executer.getPrefix() + "integers.txt";
            names[1] = File.separator +Executer.getPrefix() + "floats.txt";
            names[2] = File.separator +Executer.getPrefix() + "strings.txt";
        }
        else {
            names[0] = "integers.txt";
            names[1] = "floats.txt";
            names[2] = "strings.txt";
        }
        if(Main.getOtherPath()){
            for(int i =0; i<3;i++){
                stringPull[i]=File.separator +Executer.getPath()+names[i];
            }
            return stringPull;
        }
        return names;
    }
}
