
class Thread1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
class Thread2 implements Runnable{
    @Override
    public void run() {
        for (int j=10;j<20;j++){
            System.out.println(j);
        }
    }
}

public class CreationOfThread {
    public static void main(String[] args) {

        //using Thread class
        Thread1 thread1= new Thread1();
        thread1.start();

        //using Runnable interface
        Thread2 thread2=new Thread2();
        Thread myThread=new Thread(thread2);
        myThread.start();
    }
}
