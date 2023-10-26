package Ways_of_defining_threads;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                System.out.println("Thread 1");
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2");
            }
        }).start();

    }
}
