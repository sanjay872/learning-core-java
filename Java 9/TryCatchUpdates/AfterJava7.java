package TryCatchUpdates;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AfterJava7 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fOut=new FileOutputStream("Java 9/TryCatchUpdates/test.txt");
        try(FileOutputStream localFOut=fOut){ // local declaration is required
            localFOut.write("Hi!".getBytes());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        // auto complete exist, no close required
    }
}
