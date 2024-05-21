package core.oop_concepts.e02_classes;

public class Bicycle
{
// Those fields will represent object's state
    int cadence = 0;
    public int speed = 0;
    int gear = 1;

//  Those methods will represent object behaviour
    void changeCadence(int newValue)
    {
        cadence = newValue;
    }

    void changeGear(int newValue)
    {
        gear = newValue;
    }

    void speedUp(int increment)
    {
        speed = speed + increment;
    }

    void applyBrakes(int decrement)
    {
        speed = speed - decrement;
    }

    void printStates()
    {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}