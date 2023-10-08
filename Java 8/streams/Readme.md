# Streams
1) It is not a data Structure.
2) It consumes data and can be used to perform intermediate operation on it.
3) There are:
   - Pipeline of operations like filter, map and forEach.
   - Internal iterations.
   - Parallel execution using parallelStream.
   - Short circuit operations like findAny ,findFirst, limit.
4) In the stream API, there are two types of operations:
   - Intermediate - new operation could be added on top of it.
   - Terminal - it is the end operation.
5) Order of file:
   - Creation Operations
     - Stream of Object
     - Stream of Collections
   - Selection Operations
     - filter (Intermediate)
     - distinct (Intermediate)
     - Limit (Intermediate)
     - Skip (Intermediate)
   - Map Operation
     - map (Intermediate)
   - Sorting Operation
     - Sorted (Intermediate)
     - Sorted with comparator
   - Reduce Operation
     - Reduce (Terminal)
     - Min (Terminal)
     - Max(Terminal)
     - Count (Terminal)
     - Collect (Terminal)
     - AnyMatch (Terminal)
     - AllMatch (Terminal)
     - NoneMatch (Terminal)
     - findFirst (Terminal)
     - findAny (Terminal)