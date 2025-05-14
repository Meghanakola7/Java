# Java
HashSet:
1. The underlying data structure is Hashtable. 
2. Insertion order is not preserved and it is based on hash code of the objects. 
3. Duplicate objects are not allowed. 
4. If we are trying to insert duplicate objects we won't get compile time error and 
runtime error add() method simply returns false. 
5. Heterogeneous objects are allowed. 
6. Null insertion is possible.(only once) 
7. Implements Serializable and Cloneable interfaces but not RandomAccess. 
8. HashSet is best suitable, if our frequent operation is "Search". 
