
class ForDeadLock{
    synchronized void method1(ForDeadLock d){
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        d.method2(this);
    }
    synchronized void method2(ForDeadLock d){
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        d.method1(this);
    }
}

public class ThreadStates {
    public static void main(String[] args) {

        // list of states
//        Thread.State[] states=Thread.State.values();
//        for (Thread.State state : states) {
//            System.out.println(state);
//        }

        //New state
//        Thread t1=new Thread(){
//            @Override
//            public void run() {
//                System.out.println("I am thread");
//            }
//        };
//        System.out.println(t1.getState());

        //Runnable state
//        t1.start();
//        System.out.println(t1.getState());

        //blocked when thread is in deadlock
        final ForDeadLock d1=new ForDeadLock();
        final ForDeadLock d2=new ForDeadLock();
        Thread t2= new Thread(() -> d1.method1(d2));
        Thread t3= new Thread(() -> d2.method2(d1));
//        t2.start();
//        t3.start();

//        try
//        {
//            Thread.sleep(3000);
//        }
//        catch (InterruptedException e)
//        {
//            e.printStackTrace();
//        }
//
//        //Checking states of both the threads
//        System.out.println(t2.getState());
//        System.out.println(t3.getState());

        // waiting : when a thread is waiting for another thread

        Thread t4=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread t5=new Thread(){
            @Override
            public void run() {
                try {
                    t4.join();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

//        t4.start();
//        t5.start();
//
//        try {
//            Thread.sleep(100);
//        }
//        catch (InterruptedException e){
//            e.printStackTrace();
//        }
//
//        System.out.println(t5.getState());

        // Timed_waiting : A thread will be in this state when thread is sleeping

        Thread t6=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t6.start();

        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(t6.getState());

        //Terminated: when the thread task is over

        try {
            Thread.sleep(6000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(t6.getState());
    }
}
