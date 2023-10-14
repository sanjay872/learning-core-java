# Java 9

1. Interface private method
    - private methods in interface
    - refer InterfacePrivateMethod
2. JShell
    - you can evaluate Java code snippet or any business logic without compiling and running the whole Java program
    - Java also supports REPL tool called JShell.
    - To open jshell
      - Have java 9 or higher in system.
      - execute jshell -v in cmd.
      - try java statements
3. Immutable collections
   - Immutable collections are the collections which can not be modified once they are created.
   - Before java 9, unmodified collections are used for this purpose.
   - Refer ImmutableCollections
4. Steams Improvements
   - Four new methods are added.
   - They are – takeWhile(), dropWhile(), ofNullable() and iterate() methods in which takeWhile() and dropWhile() methods are default methods and ofNullable() and iterate() methods are static methods.
   - Refer StreamsImprovements
5. TryCatchUpdates
   - from java 7 updates are done in try and catch block.
   - Before java 7, there is no resource auto close.
   - After java 7, resource auto close is added but declaration need to be done locally within the block.
   - Now in java 9, resource auto close is there and also no need to create resource locally, it can be passed as reference from outside the block.
   - Refer TryCatchUpdates folder