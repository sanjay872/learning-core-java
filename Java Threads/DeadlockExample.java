
class SharedClass{
    synchronized void sharedMethod1(SharedClass s){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"is executing methodOne...");
        System.out.println(t.getName()+"is calling methodTwo...");
        s.sharedMethod2(this);
        System.out.println(t.getName()+"is finished executing methodOne...");
    }
    synchronized void sharedMethod2(SharedClass s){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"is executing methodTwo...");
        System.out.println(t.getName()+"is calling methodOne...");
        s.sharedMethod1(this);
        System.out.println(t.getName()+"is finished executing methodTwo...");
    }
}

public class DeadlockExample {

    public void createDeadLock(){
        final SharedClass s1 = new SharedClass();
        final SharedClass s2 = new SharedClass();

        Thread t1 = new Thread()
        {
            public void run()
            {
                s1.sharedMethod1(s2);
            }
        };

        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                s2.sharedMethod2(s1);
            }
        };

        t1.start();

        t2.start();
    }

    public static void main(String[] args) {
        final SharedClass s1 = new SharedClass();
        final SharedClass s2 = new SharedClass();

        Thread t1 = new Thread()
        {
            public void run()
            {
                s1.sharedMethod1(s2);
            }
        };

        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                s2.sharedMethod2(s1);
            }
        };

        t1.start();

        t2.start();
    }
}
