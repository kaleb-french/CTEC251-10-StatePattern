# Journal
Write your Journal questions and notes here.

Phase 1-
Honestly I have written little stateMachines like this before, although hearing about the state pattern makes it feel less intuitive. I had to use 9 case statements to achive this. I would have to add the new state to the enum and add atleast one case to each of the three methods to make sure it was utilized. 

Phase 2-
The context is the central state holding object, it holds reference to currentState and delegates actions to the state objects bound by interface contract. It is less prone to user error, and allows you to add and remove states more easily.

Phase 3-
This demonstrates the Open/Close by creating new state objects for actions without modifying existing state objects. I modified only the SentialGuard only because I hardcode the starting start if I have it passed in at runtime I wouldn't had to, I would have only needed to create the new state class.

Phase 4-
The state pattern makes phase 1 feel long winded, The state pattern allows adding and removing states with little to no modification to the other objects. Passing the objects on return and just calling the methods on the currentState object removed the conditionals and made the code less prone to user error. For me it made the logic flow easier.
