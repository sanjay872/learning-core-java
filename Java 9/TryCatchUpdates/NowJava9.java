package TryCatchUpdates;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class NowJava9 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fOut=new FileOutputStream("Java 9/TryCatchUpdates/test.txt");
        try(fOut){ // local declaration is not required, pass the outside variable as reference
            fOut.write("Hi!".getBytes());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        // auto complete exist, no close required
    }
}
