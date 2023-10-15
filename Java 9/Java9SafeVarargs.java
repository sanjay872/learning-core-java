import java.util.List;

public class Java9SafeVarargs {
    List<Integer>[] lists;

    @SafeVarargs   //If you don't use @SafeVarargs here, compiler shows warning : Potential heap pollution via varargs parameter lists
    public Java9SafeVarargs(List < Integer >...lists)
    {
        this.lists = lists;
    }

    // in java 9, we can do this in private methods
    @SafeVarargs
    private void privateSafeVarargs(List<Integer> ...list){
        System.out.println(list);
    }

    public static void main(String[] args) {

    }
}
