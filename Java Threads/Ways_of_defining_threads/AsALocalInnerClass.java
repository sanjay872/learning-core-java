package Ways_of_defining_threads;

public class AsALocalInnerClass {
    public static void main(String[] args) {
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

        //Using MyThread1 and it's task

        Thread1 thread1 = new Thread1();
        thread1.start();

        //Using MyThread2 and it's task

        Thread2 thread2 = new Thread2();
        Thread t = new Thread(thread2);
        t.start();
    }
}
