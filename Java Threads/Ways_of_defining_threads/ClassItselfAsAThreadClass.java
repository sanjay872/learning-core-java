package Ways_of_defining_threads;

public class ClassItselfAsAThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Thread");
    }

    public static void main(String[] args) {
        ClassItselfAsAThreadClass classItselfAsAThreadClass=new ClassItselfAsAThreadClass();
        classItselfAsAThreadClass.start();
    }
}
