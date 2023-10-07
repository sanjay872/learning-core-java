# Interface Changes

Exist method
- Abstract method

# Abstract Method
- No function definition in the interface.
- Refer class - InterfaceChanges

Two new methods
- Default methods
- Static methods

# Default Methods
- Overriding is optional.
- Can be added in existing interface without affecting its implementations.
- Example is stream, stream is a default method added in collection interface.
- Because of this method, we have three rules that will solve Diamond problem.
  - Rule 1: If the main class and the super class extends same interfaces and interfaces are in hierarchy, then in the call
            the super class method will be considered.
            Check class file - InterfaceChangesRule1, the implementation in class one is used and not the one in the main class.
  - Rule 2: If the main class doesn't extend any class and only implements interface are in hierarchy. Then, the specific interface is only selected.
            Check class file - InterfaceChangesRule2, the method in interface two is selected.  
  - Rule 3: If the main class doesn't extend any class and implements any interface. Then the interface could be directly call 
            from the main class.
            Check class file - InterfaceChangesRule3.
    
# Static Methods
- can't be override
- implementation exist on the interface.
- refer class - InterfaceWithStaticAndDefaultMethods.