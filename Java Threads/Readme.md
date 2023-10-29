# Threads
1. Application: Application is a program which is designed to perform a specific task. For example, MS Word, Google Chrome, a video or audio player etc.
2. Process: It is an executing instance of an application.
3. Thread: Thread is the smallest executable unit of a process. Thread has its own path of execution in a process. A single process can have multiple thread.
4. Multitasking: Multitasking is an operation in which multiple tasks are performed simultaneously. Multitasking is used to utilize CPU’s idle time. Multitasking can be of two types. One is process-based and another one is thread-based.
    - Process based multitasking: Multiple processes are executed simultaneously.
    - Thread based multitasking: Multiple threads in a process are executed simultaneously.
5. Thread types:
   - User Thread: It has the highest priority. Process won't stop until all the user threads are completed.
   - Daemon Thread: It has the lease priority. Process won't care much about daemon thread.
6. Order to read:
    - CreationOfThread : common way of creating thread
    - ways of defining threads : different ways to create thread
      - SeparateConcreteClass
      - NestedClassOrStaticInnerClass
      - InnerClassOrNonStaticInnerClass
      - AsALocalInnerClass
      - AnonymousInnerClass
      - ClassItselfAsAThreadClass
    - TypesOfThread : different types of threads
    - NameAThreadAndIdentify : how to give name to a thread and also get its id
    - ThreadPriorityAndSleep : how to set priority and sleep for a thread
    - JoinThread : Thread class is used to maintain the order of execution of threads. Using join() method, you can make the currently executing thread to wait for some other threads to finish their task. 
    - ThreadInterference : In java is a condition which occurs when more than one threads, executing simultaneously, access same piece of data.
    - SynchronizationExample: way to avoid Thread interference.
    - DeadlockExample: 
      - in java is a condition which occurs when two or more threads get blocked waiting for each other for an infinite period of time to release the resources(Locks) they hold.
      - some content must be there in the synchronization method to create deadlock, content like sleep or some print statements.
    - DetectDeadlock: using ThreadMXBean interface of java.lang.Management package.
    - AvoidDeadLock:
      - Locking order
      - Locking only some parts of the method
      - avoid nested synchronization
    - InterThreadCommunication : Threads can communicate with each other using wait(), notify() and notifyAll() methods.
      - wait() : This method tells the currently executing thread to release the lock of this object and wait until some other thread acquires the same lock and notify it using either notify() or notifyAll() methods.
      - notify() : This method wakes up one thread randomly that called wait() method on this object.
      - notifyAll() : This method wakes up all the threads that called wait() method on this object. But, only one thread will acquire lock of this object depending upon the priority.
      - These three methods must be called within synchronized method or block.
    - ThreadInterruption :  Is a mechanism in which a thread which is either sleeping or waiting can be made to stop sleeping or waiting.
    - ThreadStates: Thread has various states.
    - ThreadGroups: 
      - Thread group in java is used to group similar threads into one unit. 
      - A thread group can also contain other thread groups.
      - Handles multiple threads at same time.
    - StopThread: There two ways to stop a thread
      - By using flag
      - By using interrupt()
    - PrintOddAndEvenNumbersInSync