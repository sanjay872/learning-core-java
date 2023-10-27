
/*
    Intro

    - synchronized keyword is used.
    - blocks are create, when a whole method is not required to be synchronized.
    - static synchronized block is the block created within a static method
    - non-static synchronized block is the block created within a non-static method
    - synchronized block takes one argument, and it is called mutex.
    - If synchronized block is defined inside non-static definition blocks like non-static methods, instance initializer or constructors, then this mutex must be an instance of that class.
    - If synchronized block is defined inside static definition blocks like static methods or static initializer, then this mutex must be like ClassName.class.
*/
class Shared{

    // to sync entire method, it can be static or non-static.
    synchronized static void wholeSynMethod(){
        System.out.println("Whole syn method");
    }

    static void staticSharedMethod(){
        synchronized (Shared.class){
            System.out.println("Syn inside static method");
        }
    }

    void nonStaticSharedMethod(){
        synchronized (this){ // way 1
            System.out.println("Non static Shared Method");
        }
        synchronized (new Shared()){ // way 2
            System.out.println("Non static Shared Method");
        }
    }

}
public class SynchronizationExample {
    public static void main(String[] args) {
        /*
        * 10 points to remember
        * 1. synchronized keyword can be used on or inside a method.
        * 2.  Constructors, Static initializer and instance initializer can’t be declared with synchronized keyword, but they can contain synchronized blocks.
        * 3.  Both static and non-static methods can use synchronized keyword. For static methods, thread need class level lock and for non-static methods, thread need object level lock.
        * 4. It is possible that both static synchronized and non-static synchronized methods can run simultaneously. Because, static methods need class level lock and non-static methods need object level lock.
        * 5. A method can contain any number of synchronized blocks. This is like synchronizing multiple parts of a method.
        * 6. Synchronization blocks can be nested.
        * 7.  Lock acquired by the thread before executing a synchronized method or block must be released after the completion of execution, no matter whether execution is completed normally or abnormally (due to exceptions).
        * 8. Synchronization in java is Re-entrant in nature. A thread can not acquire a lock that is owned by another thread. But, a thread can acquire a lock that it already owns. That means if a synchronized method gives a call to another synchronized method which needs same lock, then currently executing thread can directly enter into that method or block without acquiring the lock.
        * 9. synchronized method or block is very slow. They decrease the performance of an application. So, special care need to be taken while using synchronization. Use synchronization only when you needed it the most.
        * 10. Use synchronized blocks instead of synchronized methods. Because, synchronizing some part of a method improves the performance than synchronizing the whole method.
        * */
    }
}
