# Java 10

1. Var keyword
   - you can declare local variables without mentioning their type. Compiler will automatically detects the type based on their initializers. 
   - This is called automatic type inference.
   - Refer VarKeyword
2. Collectors Methods
   - Introduced three new methods to java.util.stream.Collectors class to collect the resulting elements into unmodifiable collections. 
   - They are toUnmodifiableList(), toUnmodifiableSet() and toUnmodifiableMap(). 
   - These methods return Collector which accumulates the input elements into corresponding unmodifiable collection.
3. Copy methods
   - The methods are List.copyOf(), Set.copyOf(), Map.copyOf().
   - These methods take whole collection as an argument and create immutable copy of that collection.
   - Refer ImmutableCopyMethods