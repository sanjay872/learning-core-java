
class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println("I am user thread");
    }
}

class DaemonThread extends Thread
{
    public DaemonThread()
    {
        setDaemon(true);
    }

    @Override
    public void run()
    {
        for(int i = 0; i < 1000; i++)
        {
            System.out.println("This is daemon thread....."+i);
        }
    }
}

public class TypeOfThreads {
    public static void main(String[] args) {
        // daemon thread
        DaemonThread daemonThread=new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
        System.out.println(daemonThread.isDaemon());

        // user thread
        UserThread userThread=new UserThread();
        userThread.start();                 //Starting the thread
        try {
            userThread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(userThread.isDaemon());      //Output : false
    }
}
