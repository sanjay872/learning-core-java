package Ways_of_defining_threads;

public class InnerClassOrNonStaticInnerClass {
    class Thread1 extends Thread{
        @Override
        public void run() {
            System.out.println("Thread 1");
        }
    }
    class Thread2 implements Runnable{

        @Override
        public void run() {
            System.out.println("Thread 2");
        }
    }

    public static void main(String[] args) {
        Thread1 thread1=new InnerClassOrNonStaticInnerClass(). new Thread1();
        thread1.start();

        Thread2 thread2=new InnerClassOrNonStaticInnerClass(). new Thread2();
        Thread thread=new Thread(thread2);
        thread.start();
    }
}
