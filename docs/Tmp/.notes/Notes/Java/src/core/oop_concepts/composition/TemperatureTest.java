package core.oop_concepts.composition;

public class TemperatureTest {
    public static void main(String[] args) {
        HeatPump heatPump = new HeatPump();
        Thermostat t = heatPump;
        heatPump.setTemperature(2);
        t.setTemperature(3);


    }
}
