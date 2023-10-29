
class SharedPrinter{

    boolean isOddNumberPrinted=false;

    synchronized void printOddNumber(int number){
        while (isOddNumberPrinted){
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Printed by "+Thread.currentThread().getName()+" and the number is "+number);
        isOddNumberPrinted=true;
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        notify();
    }

    synchronized void printEvenNumber(int number){
        while (!isOddNumberPrinted){
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Printed by "+Thread.currentThread().getName()+" and the number is "+number);
        isOddNumberPrinted=false;
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        notify();
    }
}
class OddThread extends Thread{
    int limit;

    SharedPrinter sharedPrinter;

    public OddThread(int limit, SharedPrinter sharedPrinter){
        this.limit=limit;
        this.sharedPrinter=sharedPrinter;
    }

    @Override
    public void run() {
       int oddNumber=1;
       while (oddNumber<=limit){
           sharedPrinter.printOddNumber(oddNumber);
           oddNumber+=2;
       }
    }
}

class EvenThread extends Thread{

    int limit;
    SharedPrinter sharedPrinter;

    public EvenThread(int limit, SharedPrinter sharedPrinter){
        this.limit=limit;
        this.sharedPrinter=sharedPrinter;
    }

    @Override
    public void run() {
        int evenNumber=2;
        while (evenNumber<=limit){
            sharedPrinter.printEvenNumber(evenNumber);
            evenNumber+=2;
        }
    }
}

public class PrintOddAndEvenNumbersInSync {
    public static void main(String[] args) {
        final int limit=20;
        final SharedPrinter s=new SharedPrinter();
        OddThread oddThread=new OddThread(limit,s);
        oddThread.setName("Odd-thread");
        EvenThread evenThread=new EvenThread(limit,s);
        evenThread.setName("Even-thread");
        oddThread.start();
        evenThread.start();
    }
}
