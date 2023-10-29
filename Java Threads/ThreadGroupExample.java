public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup parentGroup=new ThreadGroup("Parent Group");

        Thread t1=new Thread(parentGroup,"Thread 1"){
            @Override
            public void run() {
                try{
                    sleep(5000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        t1.start();

        Thread t2=new Thread(parentGroup,"Thread 2"){
            @Override
            public void run() {
                try{
                    sleep(5000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        t2.start();

        ThreadGroup childGroup=new ThreadGroup(parentGroup,"child group");
        Thread t3=new Thread(childGroup,"Thread 3"){
            @Override
            public void run() {
                try{
                    sleep(5000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        t3.start();

        // get parent of the child
        System.out.println(childGroup.getParent());

        // set and get max priority
        parentGroup.setMaxPriority(8);
        System.out.println(parentGroup.getMaxPriority());

        // get active threads count and active group count
        System.out.println(parentGroup.activeCount());
        System.out.println(parentGroup.activeGroupCount());

        // interrupt all thread in a group
        //parentGroup.interrupt();

        // enumerate

        /*
        There exist four versions of enumerate() method in ThreadGroup class. They are,

            public int enumerate(Thread[] list) —> It copies all active threads of a group into specified array of threads.

            public int enumerate(Thread[] list, boolean recurse) —> It copies all active threads of a group into specified array of threads. If recurse is true, subgroups are also enumerated.

            public int enumerate(ThreadGroup[] list) —> It copies all active subgroups of a thread group into specified array of ThreadGroup.

            public int enumerate(ThreadGroup[] list, boolean recurse) —> It copies all active subgroups of a thread group into specified array of ThreadGroup. If recurse is true, subgroups of subgroups are also enumerated.
        */


        //enumerate all active threads
        Thread[] threads=new Thread[parentGroup.activeCount()];
        int active_threads=parentGroup.enumerate(threads);
        System.out.println(active_threads);
        for (Thread thread : threads) {
            System.out.println(thread.getName());
        }

    }
}
