public class JoinThread {
    public static void main(String[] args) {
        Thread thread1=new Thread(){
            @Override
            public void run() {
                for (int i=1;i<=10;i++){
                    System.out.println(i);
                }
            }
        };

        Thread thread2=new Thread(){
            @Override
            public void run() {
                try {
                    thread1.join(5000); // it waits 5 sec for the thread 1 to complete, and then it resumes thread2
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                for (int i=11;i<=20;i++){
                    System.out.println(i);
                }
            }
        };

        Thread thread3=new Thread(){
            @Override
            public void run() {
                try {
                    thread2.join(5000); // it waits 5 sec for the thread 2 to complete, and then it resumes thread2
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                for (int i=21;i<=30;i++){
                    System.out.println(i);
                }
            }
        };

        thread3.start();
        thread2.start();
        thread1.start();
    }
}
