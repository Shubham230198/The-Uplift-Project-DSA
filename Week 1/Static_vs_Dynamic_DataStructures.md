# Static and Dynamic data structures
Data structure is a way of storing and organising data efficiently such that the required operations on them can be performed efficiently with respect to time as well as memory. Simply, Data Structure is used to reduce complexity (mostly the time complexity) of the code.

Data structures can be two types:
* Static Data Structure
* Dynamic Data Structure


## Static Data structure
In the Static data structure, the size of the structure is fixed. The content of the data structure can be modified but without changing the memory space allocated to it.
  
  ### Examples of Static Data structure:
  - ARRAY: An array is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. An array is a group of like-typed variables that are referred to by a common name. Arrays in Java work differently than they do in C/C++. Once we create the Array we cannot alter the size of the array. So the size of the array is unalterable.

![array](https://github.com/Shubham230198/The-Uplift-Project-DSA/blob/master/images/Arrays-1.png)
  
  
## Dynamic Data Structure
In Dynamic data structure the size of the structure in not fixed and can be modified during the operations performed on it. Dynamic data structures are designed to facilitate change of data structures in the run time.
  
 ### Examples of Dynamic Data Structure:
  - SINGLY LINKED LIST: Linked List are linear data structures where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays.
  
  ![singly linked list](https://github.com/Shubham230198/The-Uplift-Project-DSA/blob/master/images/Linkedlist-2.png)
  
  - DOUBLY LINKED LIST: A Doubly Linked List (DLL) contains an extra pointer, typically called the previous pointer, together with next pointer and data which are there in a singly linked list.
  
  ![doubly linked list](https://github.com/Shubham230198/The-Uplift-Project-DSA/blob/master/images/DLL1.png)
  
  - VECTOR: The Vector class implements a growable array of objects. Vectors basically fall in legacy classes but now it is fully compatible with collections. Vector implements a dynamic array that means it can grow or shrink as required. Like an array, it contains components that can be accessed using an integer index.
  
  ![vector](https://github.com/Shubham230198/The-Uplift-Project-DSA/blob/master/images/ArrayList_Dianamic-1.jpg)
  
  - STACK: Java Collection framework provides a Stack class which models and implements a Stack data structure. The class is based on the basic principle of last-in-first-out. In addition to the basic push and pop operations, the class provides three more functions of empty, search and peek. The class can also be said to extend Vector and treats the class as a stack with the five mentioned functions. The class can also be referred to as the subclass of Vector.
  
  ![stack](https://github.com/Shubham230198/The-Uplift-Project-DSA/blob/master/images/stack-1.png)
  
  - QUEUE: The Queue interface is available in java.util package and extends the Collection interface. The queue collection is used to hold the elements about to be processed and provides various operations like the insertion, removal etc. It is an ordered list of objects with its use limited to insert elements at the end of the list and deleting elements from the start of list i.e. it follows the FIFO or the First-In-First-Out principle.
  
  ![queue](https://github.com/Shubham230198/The-Uplift-Project-DSA/blob/master/images/queue-1.png)
  
  - TREE: A Tree is a data structure that stores values inside entities called Nodes. Nodes are connected through lines referred to as edges. Each node stores a value inside it. It also follow the characterstics of dynamic data strucutres,i.e they can grow at run time.
    - Terminology:
      - Root is the topmost node of the tree.
      - Parent is a node that has one or more Nodes attached to it.
      - Edge is the link joining the two nodes.
      - Child is a node that has a parent node
      - Leaf is a node that doesn’t have any child node attached to it, it is the bottommost node of a tree.
      
 ![tree](https://github.com/Shubham230198/The-Uplift-Project-DSA/blob/master/images/AA-tree.png)
