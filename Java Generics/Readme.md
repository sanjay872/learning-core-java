# Generics
1. Why Generics?
    - To avoid getting type casting exceptions.
    - Refer WhyGenerics class
    - This was introduced in java 5.
2. Creating Generic Class :
    - Class Name followed by angle brackets(<>).
    - class class_name<>
    - CreatingGenericClass
3. GenericInterface:
   - Only generic classes can implement generic interfaces.
   - A normal class can implement a generic interface if type parameter of generic interface is a wrapper class.
   - Class implementing generic interface at least must have same number and same type of parameters and at most can have any number and any type of parameters.
   - You can change the type of parameter passed to generic interface while implementing it.
4. GenericMethodsAndConstructors:
   - One more addition to generics is Generic Methods. If you don’t want whole class or interface to be generic, you want only some part of class as generic, then generic methods will be solution for this.
   - Even non-generic class can have generic constructors.
5. BoundedTypes:
   - Many times it will be useful to limit the types that can be passed to type parameters.
   - For that purpose, bounded types or bounded type parameters are introduced in generics. Using bounded types, you can make the objects of generic class to have data of specific derived types.
6. WildCardArguments:
   - Wildcard arguments means unknown type arguments.
   - They just act as placeholder for real arguments to be passed while calling method.
7. GenericsAndTheirInheritance :
   - A generic class can extend a non-generic class.
   - Generic class can also extend another generic class. When generic class extends another generic class, subclass should have at least same type and same number of type parameters and at most can have any number and any type of parameters.
8. TypeErasure:
   - One more interesting thing about generics is type erasure.