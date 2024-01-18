import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ErrorHandler {
    public static void errorHandling(int errorCodeValue){
        if(errorCodeValue==1){
            System.out.println("You entered the wrong query. Check that the query and file paths are correct ");
            Scanner scanner = new Scanner(System.in);
            Main.setFileNames(new ArrayList<>(Arrays.asList(scanner.nextLine().split(" "))));
            Executer.launch();
        }
        else{
            System.out.println("algorithm error");
            System.exit(2);
        }
    }

}
