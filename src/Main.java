import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    private static boolean otherPath=false;
    private static boolean prefix=false;
    private static boolean shortStatistics=false;
    private static boolean fullStatistics=false;
    private static boolean appendIt=false;
    private static ArrayList<String> fileNames = new ArrayList<>();

    public static void main(String[] args) {
       fileNames = new ArrayList<>(Arrays.asList(args));
       Executer.launch();
    }

    public static boolean getOtherPath() {
        return otherPath;
    }

    public static void setOtherPath(boolean otherPath) {
        Main.otherPath = otherPath;
    }

    public static boolean getPrefix() {
        return prefix;
    }

    public static void setPrefix(boolean prefix) {
        Main.prefix = prefix;
    }

    public static boolean getShortStatistics() {
        return shortStatistics;
    }

    public static void setShortStatistics(boolean shortStatistics) {
        Main.shortStatistics = shortStatistics;
    }

    public static boolean getFullStatistics() {
        return fullStatistics;
    }

    public static void setFullStatistics(boolean fullStatistics) {
        Main.fullStatistics = fullStatistics;
    }

    public static boolean getAppendIt() {
        return appendIt;
    }

    public static void setAppendIt(boolean appendIt) {
        Main.appendIt = appendIt;
    }

    public static ArrayList<String> getFileNames() {
        return fileNames;
    }

    public static void setFileNames(ArrayList<String> fileNames) {
        Main.fileNames = fileNames;
    }
}
