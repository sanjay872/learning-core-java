import java.util.ArrayList;

public class WhyGenerics {
    public static void main(String[] args) {

        // without generics
        ArrayList arrayList1=new ArrayList();
        arrayList1.add("abc");
        arrayList1.add(113);
        for (Object o : arrayList1) {
            //String data=(String) o; // throws error for converting int into string
            //System.out.println(data);
        }

        //with generics
        ArrayList<String> arrayList2=new ArrayList();
        arrayList2.add("abc");
        arrayList2.add("def");
        for (String data: arrayList2) {
            System.out.println(data);
        }
    }
}
