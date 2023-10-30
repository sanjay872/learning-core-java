
class GenericClassOne<T>
{
    T t;    //T will be replaced by java.lang.Object when compiled
}

class GenericClassTwo<T extends Number>
{
    T t;    //T will be replaced by java.lang.Number when compiled
}
public class TypeErasure {
    public static void main(String[] args) {

    }
}
