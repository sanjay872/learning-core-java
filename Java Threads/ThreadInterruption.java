
public class ThreadInterruption {
    public static void main(String[] args) {
        // interrupt by main thread
        Thread t1=new Thread(){
            @Override
            public void run() {
                System.out.println(isInterrupted());
                interrupt();
                try {
                    sleep(10000);
                }
                catch (InterruptedException e){
                    System.out.println("Interrupted!");
                }
                System.out.println(isInterrupted());
            }
        };
        t1.start();
        t1.interrupt();

        // self interrupt
        Thread t2=new Thread(){
            @Override
            public void run() {
                System.out.println(interrupted()); // similar to isInterrupted
                interrupt();
                System.out.println(interrupted());
                try {
                    sleep(5000);
                }
                catch (InterruptedException e){
                    System.out.println("Interrupted again!");
                }
                System.out.println(interrupted());
            }
        };
        t2.start();
    }
}
