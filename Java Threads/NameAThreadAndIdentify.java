public class NameAThreadAndIdentify extends Thread{
    @Override
    public void run() {
            System.out.println("Thread");
    }

    public static void main(String[] args) {
        NameAThreadAndIdentify nameAThreadAndIdentify =new NameAThreadAndIdentify();
        nameAThreadAndIdentify.start();

        /* Name a thread: name are not unique, different threads can have same name */

        nameAThreadAndIdentify.setName("NamedThread");
        System.out.println(nameAThreadAndIdentify.getName());

        //get current thread name
        Thread thread=Thread.currentThread();
        System.out.println(thread.getName());

        thread.setName("Main thread");
        System.out.println(thread.getName());

        /* identify thread: to identify a thread we can use id, also we can't assign the id  */
        System.out.println(thread.threadId());

    }
}
