# Java Collections
1. Collections are nothing but group of objects stored in well-defined manner. Earlier, Arrays are used to represent these group of objects. 
2. Collection Framework in java is a centralized and unified theme to store and manipulate the group of objects.
3. The entire collection framework is divided into four interfaces.
   1) List  —> It handles sequential list of objects. ArrayList, Vector and LinkedList classes implement this interface.
   2) Queue  —> It handles the special group of objects in which elements are removed only from the head. LinkedList and PriorityQueue classes implement this interface.
   3) Set  —> It handles the group of objects which must contain only unique elements. This interface is implemented by HashSet and LinkedHashSet classes and extended by SortedSet interface which in turn, is implemented by TreeSet.
   4) Map  —> This is the one interface in Collection Framework which is not inherited from Collection interface. It handles the group of objects as Key/Value pairs. It is implemented by HashMap and HashTable classes and extended by SortedMap interface which in turn is implemented by TreeMap.
4. Map is a separate interface, which is not part of collections Interface.
5. Refer collections folder for collection details and other interfaces that extends it.
6. Refer Map folder for details on map.