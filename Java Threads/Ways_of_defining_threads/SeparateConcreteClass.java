package Ways_of_defining_threads;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 1");
    }
}

public class SeparateConcreteClass {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
    }
}
