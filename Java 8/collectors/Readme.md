# Collectors

There are mainly three things:
- Stream.collect()
- Collector Interface
- Collectors class

Refer collectors folder

# Collect()
    1. It is a terminal operation in stream api.
    2. It is a special case of reduction operation called mutable reduction operation.
    3. Because it returns mutable result container such as List, Set or Map according to supplied Collector.
    4. Refer StreamCollect class

# Collector
    1. It an interface in stream package.
    2. It has 4 functions:
        a) Supplier() :
            A function that creates and returns a new mutable result container.
        b) accumulator() :
            A function that accumulates a value into a mutable result container.
        c) combiner() :
            A function that accepts two partial results and merges them.
        d) finisher() :
            A function that performs final transformation from the intermediate accumulation type to the final result type.

# Collectors class
    1. It provides static methods, which performs reduce operations.
    2. java.util.stream.Collectors class contains static factory methods which perform some common reduction operations such as accumulating elements into Collection, 
        finding min, max, average, sum of elements etc. All the methods of Collectors class return Collector type which will be supplied to collect() method as an argument.
    3. Refer StreamCollectors class