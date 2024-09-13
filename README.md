# Inheritance and Delegation

This repository is set up for discussion on relative strengths and weaknesses of 
`inheritance` and `delegation` in 17214 24 fall recitation 03.

The handout can be found at: [https://github.com/CMU-17-214/f2024/blob/main/labs/lab03.md](https://github.com/CMU-17-214/f2024/blob/main/labs/lab03.md)


## Questions
1. Does the totalAdded change when removing an element from the list?

## Discussion Questions
Which is more dependent on the implementation details of the SortedIntList, delegation or inheritance?

Inheritance, because the SortedIntList is a subclass of IntList, 
so it inherits all the methods and fields of IntList. 
If the implementation of IntList changes, it could break the SortedIntList implementation.
And how to manipulate the totalAdded field is also dependent on the implementation details of SortedIntList.

---------------------------------------------------------------------------------------------
If the add method in SortedIntList is significantly modified or its behavior changes, 
which implementation is more likely to break?

Inheritance, because the add method in SortedIntList is overriding the add method in IntList.
How the add method behaves in InheritanceSortedIntList is dependent on the implementation details of SortedIntList.
DelegateSortedIntList just uses the add method in IntList, it doesn't change or modify add method in IntList.

---------------------------------------------------------------------------------------------
What issues does using delegation solve that might have been problematic with inheritance?

Delegation solves the problem of the tight coupling between the subclass and the superclass.
It performs better when the superclass is fragile and often changes.
It also allows for more flexibility in the design of the subclass.

---------------------------------------------------------------------------------------------
Based on the provided implementations, when would it be more appropriate to use inheritance and when to use delegation?

If the superclass is stable and unlikely to change, and the subclass is pretty much the same as the superclass, 
and you want less code, inheritance is more appropriate.
If the superclass is fragile and often changes, and you want more flexibility, delegation is more appropriate.


