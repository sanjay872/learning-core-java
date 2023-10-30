
interface customInterface{

}

class GenericTypeWithBound<T extends Number & customInterface>{ // also possible extends multiple interface
    private T t;

    public GenericTypeWithBound(T t){
        this.t=t;
    }

    public void set(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }

    //Declaring T as bounded type to Number class

    public static <T extends Number> void printNumbers(T[] t)
    {
        for (int i = 0; i < t.length; i++)
        {
            System.out.println(t[i]);
        }
    }

}
public class BoundedTypes {
    public static void main(String[] args) {

        GenericTypeWithBound genericTypeWithInteger=new GenericTypeWithBound(123);
        GenericTypeWithBound genericTypeWithDouble=new GenericTypeWithBound(1.21);
        //GenericTypeWithBound genericTypeWithString=new GenericTypeWithBound("error"); // can't try string
        System.out.println(genericTypeWithInteger.get());
        System.out.println(genericTypeWithDouble.get());

        // bounded with parameter
        GenericTypeWithBound.printNumbers(new Integer[]{1,2,3,4});
        GenericTypeWithBound.printNumbers(new Double[]{1.1,2.2,3.3,4.4});
    }
}
