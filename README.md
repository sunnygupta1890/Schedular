# Schedular
Application taking task with inter-dependencies and predict the correct order using topological sort.

Suppose you have tasks like a, b and c. You are given the inter-dependencies of these tasks. For example, Task1 => Task2 ~ This means Task1 is dependent on Task2. So Task2 should be executed before Task1. In the similar fashion, the dependency order of tasks is given [ a => b, b => c]. The correct order in which task should be executed is [c,b,a]
