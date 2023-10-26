
class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("thread 1");
        try{
            sleep(2000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("thread 2");
    }
}

public class ThreadPriorityAndSleep {
    public static void main(String[] args) {
        MyThread1 thread1=new MyThread1();
        thread1.setPriority(Thread.NORM_PRIORITY);

        MyThread2 thread2=new MyThread2();
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();

    }
}
