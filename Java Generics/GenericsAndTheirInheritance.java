
class GenericSuperClassOne<T1>
{
    //Generic class with one type parameter
}

interface GenericInterfaceOne<T1, T2>
{
    //Generic interface with two type parameters
}

interface GenericInterfaceTwo<T2, T3>
{
    //Generic interface with two type parameters
}

class GenericSuperClass<T>
{
    T t;

    public GenericSuperClass(T t)
    {
        this.t = t;
    }
}

class GenericSubClass<T> extends GenericSuperClass<T>
{
    public GenericSubClass(T t)
    {
        super(t);
    }
}

// extends only one class but can implement multiple interfaces
class GenericClassInheritance<T1,T2,T3> extends GenericSuperClassOne<T1> implements GenericInterfaceOne<T1,T2>,GenericInterfaceTwo<T2,T3>{

}
public class GenericsAndTheirInheritance {
    public static void main(String[] args) {
        GenericSubClass<String> g=new GenericSubClass<>("test");
        System.out.println(g.t);
    }
}
