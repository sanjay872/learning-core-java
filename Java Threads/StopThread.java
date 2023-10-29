
class ThreadWithFlag extends Thread{

    private volatile boolean flag=true;

    public void stopThread(){
        flag=false;
    }

    @Override
    public void run() {
        while(flag){
            System.out.println("I am running...........");
        }
    }
}

class ThreadWithInterrupt extends Thread{
    @Override
    public void run() {
        while (!Thread.interrupted()){
            System.out.println("I am running...............");
        }
    }
}

public class StopThread {
    public static void main(String[] args) {
        ThreadWithFlag t1=new ThreadWithFlag(); // way 1
        ThreadWithInterrupt t2=new ThreadWithInterrupt(); // way 2
        //t1.start();
        t2.start();
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        //t1.stopThread();
        t2.interrupt();
    }
}
