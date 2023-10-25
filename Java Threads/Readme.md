# Threads
1. Application: Application is a program which is designed to perform a specific task. For example, MS Word, Google Chrome, a video or audio player etc.
2. Process: It is an executing instance of an application.
3. Thread: Thread is a smallest executable unit of a process. Thread has it’s own path of execution in a process. A single process can have multiple thread.
4. Multitasking: Multitasking is an operation in which multiple tasks are performed simultaneously. Multitasking is used to utilize CPU’s idle time. Multitasking can be of two types. One is process-based and another one is thread-based.
    - Process based multitasking: Multiple processes are executed simultaneously.
    - Thread based multitasking: Multiple threads in a process are executed simultaneously.
5. Thread types:
   - User Thread: It has the highest priority. Process won't stop until all the user threads are completed.
   - Daemon Thread: It has the lease priority. Process won't care much about daemon thread.
6. Order to read:
    - CreationOfThread
    - TypesOfThread