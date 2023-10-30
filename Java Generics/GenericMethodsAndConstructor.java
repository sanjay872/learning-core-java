
public class GenericMethodsAndConstructor {

    public <T> GenericMethodsAndConstructor(T t){
        T t2=t;
        System.out.println(t);
    }

    static <T> void genericStaticMethod(T t){
        T t1=t;
        System.out.println(t1);
    }

    <V> void genericNonStaticMethod(V v){
        V v1=v;
        System.out.println(v);
    }

    public static void main(String[] args) {

        // generic static methods
        GenericMethodsAndConstructor.genericStaticMethod("String");
        GenericMethodsAndConstructor.genericStaticMethod(123);

        //generic constructor
        GenericMethodsAndConstructor g=new GenericMethodsAndConstructor("generic constructor");

        //generic non-static methods
        g.genericNonStaticMethod("non static");
        g.genericNonStaticMethod(321);

    }
}
