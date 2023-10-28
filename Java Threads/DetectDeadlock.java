import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class DetectDeadlock {
    public static void main(String[] args) {

        // creating deadlock
        DeadlockExample deadlockExample=new DeadlockExample();
        deadlockExample.createDeadLock();

        //detect deadlock
        ThreadMXBean threadMXBean= ManagementFactory.getThreadMXBean(); // to detect locked thread
        long[] ids=threadMXBean.findMonitorDeadlockedThreads(); // get ids of locked threads
        ThreadInfo[] threadInfo =threadMXBean.getThreadInfo(ids); // get info on those thread by ids
        for (ThreadInfo info : threadInfo) { // looping through the info
            System.out.println("Thread Id: "+info.getThreadId()); // thread Id
            System.out.println("Thread Name: "+info.getThreadName()); // thread name
            System.out.println("Thread Locked object name: "+info.getLockName()); // prints the string representation of the object on which thread has entered deadlock
            System.out.println("Thread Lock owner id: "+info.getLockOwnerId()); // prints id of the thread which currently owns the locked object
            System.out.println("Thread Lock owner name: "+info.getLockOwnerName()); // prints name of the thread which currently owns the locked object
        }

    }
}
