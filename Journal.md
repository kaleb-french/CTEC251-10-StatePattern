# Journal
Write your Journal questions and notes here.

Phase 1-
Honestly I have written little stateMachines like this before, although hearing about the state pattern makes it feel less intuitive. I had to use 9 case statements to achive this. I would have to add the new state to the enum and add atleast one case to each of the three methods to make sure it was utilized. 

Phase 2-
The context is the central state holding object, it holds reference to currentState and delegates actions to the state objects bound by interface contract. It is less prone to user error, and allows you to add and remove states more easily.
