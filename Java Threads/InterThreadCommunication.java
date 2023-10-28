
class SharedMethods{
    synchronized void methodOne(){
        Thread t=Thread.currentThread();

        System.out.println(t.getName()+" has the object lock now");
        try {
            wait(); // releases the current object lock to other threads
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(t.getName()+ " has the object lock again");
    }

    synchronized void methodTwo(){
        Thread t=Thread.currentThread();
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        notify(); //wakes up one thread randomly which is waiting for lock of this object
        System.out.println("A thread which is waiting for lock of this object is notified by "+t.getName()); // gave up the lock
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        final SharedMethods s=new SharedMethods();

        //Method 1
        new Thread(){
            @Override
            public void run() {
                s.methodOne();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                s.methodOne();
            }
        }.start();

        //Method 2
        new Thread(){
            @Override
            public void run() {
                s.methodTwo();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                s.methodTwo();
            }
        }.start();
    }
}
