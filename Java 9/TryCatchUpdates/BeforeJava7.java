package TryCatchUpdates;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BeforeJava7 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fOut=new FileOutputStream("Java 9/TryCatchUpdates/test.txt");
        try{
            fOut.write("Hi!".getBytes());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fOut.close(); // no auto close so, we need to close it to avoid memory issue.
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
