
class GenericClass1<T>{

    private T t;

    public GenericClass1(T t){
        this.t=t;
    }

    public void setData(T t){
        this.t=t;
    }

    public T getData(){
        return this.t;
    }


}
public class CreatingGenericClass {
    public static void main(String[] args) {
        GenericClass1<String> stringGeneric=new GenericClass1<>("hi");
        System.out.println(stringGeneric.getData());
        GenericClass1<Integer> integerGeneric=new GenericClass1<>(123);
        System.out.println(integerGeneric.getData());
    }
}
