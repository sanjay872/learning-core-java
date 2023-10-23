# Set
1. The Set interface defines a set.
2. The set is a linear collection of objects with no duplicates.
3. Duplicate elements are not allowed in a set.
4. The Set interface extends Collection interface.
5. Set interface does not have its own methods. 
6. All it’s methods are inherited from Collection interface.
7. Classes:
   - HashSet: Elements will be in random order.
     - It Internally uses HashMap to store the data.
   - LinkedHashSet: Elements will be in the order of insertion.
     - It internally uses LinkedHashMap to store its elements just like HashSet which internally uses HashMap to store its elements. 
     - LinkedHashSet maintains insertion order.
     - This is the main difference between LinkedHashSet and HashSet.
   - SortedSet: It extends set interface. It allows to pass comparator for sorting.
   - NavigableSet: The NavigableSet is a SortedSet with navigation facilities. The NavigableSet interface provides many methods through them you can easily find closest matches of any given element.
   - TreeSet: Elements will be in natural sort order by default.
     - You need to supply this Comparator while creating a TreeSet itself. 
     - If you don’t pass any Comparator while creating a TreeSet, elements will be placed in their natural ascending order.