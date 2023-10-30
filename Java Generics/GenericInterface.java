public interface GenericInterface<T,K,V> {
    void set(T t);
}
interface  GenericInterface2<T>{

}
class GenericClass<T,K,V> implements GenericInterface<T,K,V>, GenericInterface2<T>{

    T t;

    @Override
    public void set(T t) {
        this.t=t;
    }

}
class NormalClass implements GenericInterface<Integer,String,Integer>{

    Integer i;

    @Override
    public void set(Integer integer) {
        this.i=integer;
    }
}