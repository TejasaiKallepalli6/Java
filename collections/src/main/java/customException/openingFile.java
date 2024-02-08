package customException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class openingFile {
    public static void main(String[] args) {
        try
        {
            File myfile= new File(("C:\\Users\\tejas\\OneDrive\\Desktop\\Test.txt"));

            Scanner sc= new Scanner(myfile);
            while(sc.hasNext()){
                String data=sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println("Error occured ");
            e.printStackTrace();
        }
    }
}



