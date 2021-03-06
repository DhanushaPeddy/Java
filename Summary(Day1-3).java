Day 1 :

1)Source code Vs Object code
  source code -> code we write
  object code -> code that is in .class file or in any compiled file
2)Compiler with flags
  Breakpoints can be identified in eclipse(in debug mode)
  We can check the flow of program 
3)Keywords and variables
  keywords -> special meaning/reserved words used in prog langs.
  Variables -> names of identifiers
4)Variable Scope,lifetime,intial value,modifiers
  variable scope -> block where variable is visible/accesible
  lifetime -> time which variable lives in 
  Intial value -> if not intialised, default values are taken into consideration
  Modifiers -> For restrictions
  Access modifiers(public,private,protected) , non access modifiers(final,static,etc)
5) Selection constructs -> if,switch
   Looping constructs -> for, while, do-while
6) Array Declaration -> datatype[] array_name = new datatype[size];
7) Processing array elements -> done through index value
   or can directly assign as int[] arr = new int[]{1,2,3,4,5};


----------------------------------------------------------------------------------------------


Day 2 : 

1) Pointers
    Java doesn't support pointers to minimize errors in runtime  
    Instead, it is done through call by refernce where develpers don't have any control over them
2) Functions
    Definition -> access_specifier return type methodname() { ---- }
    Invocation -> classObject.function();
3) Call by value & refernces
    by value -> value is passed as parameter
    by reference -> refernce is passed (class object)
4) DMA
    allocation -> memory on heap (with new operator)
    deallocation -> garbage collector(automatically deletes memory if it is no longer usable)
5) Memory leakage 
    Situation occurs where memory is not deallocated(even when it is no longer needed)
6) User defined structures
    User defined structures are used for a collection of heterogenous elements
    such as class , structures and unions
7) access data members
      public -> can be accessed anywhere
      private -> by generating getters/setters
8) DMA for user defined structures
9) Array of pointers
    Array of objects to store multiple objects of class
10) Iterate array of pointers
    Iteration can be done using for and for-each loop
    
    
----------------------------------------------------------------------------------------------


Day 3 :

Arrays
  -> Random access
  -> Static allocation
  -> Can go random
  -> store homogenous data in fixed size
 
Linked List
  -> Sequential access
  -> Dynamic Allocation
  -> Can add/retrieve at/from any position 
  -> To store any records

Stack
  -> Sequential access
  -> Dynamic Allocation
  -> From the top
  -> For expression evaluations
  
 Queue
  -> Sequential access
  -> Dynamic Allocation
  -> From the front(retrieval) and rear(pushing)
  -> Ordering
Binary Tree
  -> Hierarchial
  -> DMA
  -> DFS, BFS
  -> To store any hierarchial structure(college management, organization structure, etc)
