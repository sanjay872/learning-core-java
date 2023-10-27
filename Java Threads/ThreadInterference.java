
class SharedMethod{
    int i;
    void sharedMethod(){
        i=10;
        System.out.println(i);
        i=20;
        System.out.println(i);
        i=30;
        System.out.println(i);
    }
}
public class ThreadInterference {
    public static void main(String[] args) {

        final SharedMethod s=new SharedMethod();

        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                s.sharedMethod();
            }
        };

        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                s.sharedMethod();
            }
        };

        t1.start();

        t2.start();
    }
}
