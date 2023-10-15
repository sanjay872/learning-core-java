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
6. Diamond Operator
   - Before Java 7, type need to be declared on both sides of the initialisation.
   - After Java 7, it is enough if type is declared only on left side of the initialisation.
     - but, anonymous inner classes can be used. if that case on both the side, it must be declared.
   - After Java 9, it is enough if type is declared only on left side of the initialisation. Even while using anonymous inner classes.
   - Refer DiamondOperator
7. Underscore changes
   - _ is reserved as a keyword from java 9.
   - if _ is used as variable name, from java 9 version it will throw error.
   - Refer UnderscoreChanges
8. @Java9SafeVarargs Annotation changes
   - Varargs means a method or constructor can take arguments of variable length i.e any number of arguments. 
   - It is denoted by ... Varargs could cause heap pollution if not used properly.
   - @Java9SafeVarargs annotation is introduced from Java 7 to suppress the warnings thrown by the methods or constructors which take varargs arguments.
   - It tells the compiler that following method or constructor doesn’t perform any unsafe operations on varargs arguments. 
   - Till Java 9, Java9SafeVarargs annotation is allowed to use with final and static methods and constructors which take varargs arguments. 
   - From Java 9, it can be applied to private methods also.
   - Refer Java9SafeVarargs
9. Optional class improvements
   - Added new functions in it.
   - which are ifPresentOrElse(), or() and stream().
   - Refer OptionalImprovements