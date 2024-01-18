import java.util.ArrayList;


public class Executer{
   private static String prefix="";
    private static String path="";
    private static int countOfInputFiles=0;
    public static void launch(){
        ArrayList<String> fileNames = Main.getFileNames();
        fileNames = checkOptions(fileNames);

        countOfInputFiles = fileNames.size();
        String[]inputFilesPath = Pathfinder.findOutputFilesPaths();
        ArrayList<ArrayList<String>> strokesArray = new ArrayList<>();
        strokesArray=ReaderFromInputFiles.read(fileNames);
        ArrayProcessor.process(strokesArray,inputFilesPath);
        if(Main.getShortStatistics()){
            Statistics.printShortStatistics();
        }
        if(Main.getFullStatistics()){
            Statistics.printFullStatistics();
        }
    }


    public static ArrayList<String> checkOptions(ArrayList<String> options){
        try {
            for (int i = 0; i < options.size(); i++) {
                if(options.get(i).equals(" ")){
                    options.remove(i);
                    i--;
                    continue;

                }
                if (options.get(i).equals("-o")) {
                    Main.setPrefix(true);
                    path = options.get(i + 1);
                    options.remove(i);
                    options.remove(i);
                    i--;
                    continue;

                }
                if (options.get(i).equals("-p")) {
                    Main.setPrefix(true);
                    prefix = options.get(i + 1);
                    options.remove(i);
                    options.remove(i);
                    i--;
                    continue;
                }
                if (options.get(i).equals("-s")) {
                    Main.setShortStatistics(true);
                    options.remove(i);
                    i--;
                    continue;

                }
                if (options.get(i).equals("-f")) {
                    Main.setFullStatistics(true);
                    options.remove(i);
                    i--;
                    continue;

                }
                if(options.get(i).equals("-a")){
                    Main.setAppendIt(true);
                    options.remove(i);
                    i--;
                    continue;

                }
                if(options.get(i).equals("exit")){
                    System.exit(1);
                }
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        return options;
    }

    public static String getPrefix() {
        return prefix;
    }

    public static void setPrefix(String prefix) {
        Executer.prefix = prefix;
    }

    public static String getPath() {
        return path;
    }

    public static void setPath(String path) {
        Executer.path = path;
    }

    public static int getCountOfInputFiles() {
        return countOfInputFiles;
    }

    public static void setCountOfInputFiles(int countOfInputFiles) {
        Executer.countOfInputFiles = countOfInputFiles;
    }
}
