package core.oop_concepts.e03_inheritance;

import core.oop_concepts.e02_classes.Bicycle;

public class MountainBike extends Bicycle
{
    // This gives MountainBike all the same fields and methods as Bicycle  yet allows its code to focus exclusive on the features that make it unique
    int num_of_dampers = 1; // field only for mountain bikes

    /*
        This makes code for your subclasses easy to read. However, you must take care to properly document the state and behavior that each superclass defines, since that code will not appear in the source file of each subclass.
    */
}