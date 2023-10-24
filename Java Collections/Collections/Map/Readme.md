# Map
1. The Map interface in java is one of the four top level interfaces of Java Collection Framework along with List, Set and Queue interfaces.
2. But, unlike others, it doesn’t inherit from Collection interface.
3. Instead, it starts its own interface hierarchy for maintaining the key-value associations.
4. Classes:
    - HashMap: HashMap is not internally synchronized. Therefore, it is not safe to use HashMap in multithreaded applications without external synchronization. You can externally synchronize HashMap using Collections.synchronizedMap() method.
    - HashTable: HashTable is internally synchronized. Therefore, it is very much safe to use HashTable in multithreaded applications.
    - ConcurrentHashMap: The main difference between HashMap and ConcurrentHashMap is that ConcurrentHashMap is internally synchronized and hence it is thread safe.
5. HashMap into ArrayList
    - As HashMap contains key-value pairs, there are three ways you can convert given HashMap to ArrayList.
    - You can convert HashMap keys into ArrayList or you can convert HashMap values into ArrayList or you can convert key-value pairs into ArrayList.
    - Let’s see these three methods in detail, refer HashMapIntoArrayList class.
