package core.oop_concepts.composition;
// heats and cools water
public class HeatPump extends Thermostat {
    private final AC cooler = new AC();
    private final Heater heater = new Heater();
    @Override
    public void setTemperature(int temp) {
        if ( getTemperature()  < temp ) {
            System.out.println("It's colder here, heating!");
            heater.heat(temp);
        } else if ( getTemperature() > temp ) {
            System.out.println("It's warmer here, cooling!");
            cooler.cool(temp);
        } else {
            System.out.println("Temperature Unchanged");
        }
    }
}
