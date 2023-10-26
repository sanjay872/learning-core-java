package Ways_of_defining_threads;

public class NestedClassOrStaticInnerClass {
    static  class MyThread1 extends Thread{
        @Override
        public void run() {
            System.out.println("Thread 1");
        }
    }

    static  class MyThread2 implements Runnable{
        @Override
        public void run() {
            System.out.println("Thread 2");
        }
    }

    public static void main(String[] args) {
        MyThread1 thread=new MyThread1();
        thread.start();

        MyThread2 thread2= new MyThread2();
        Thread myThread=new Thread(thread2);
        myThread.start();
    }
}
