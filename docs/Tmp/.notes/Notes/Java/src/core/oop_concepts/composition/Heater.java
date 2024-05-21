package core.oop_concepts.composition;

public class Heater extends Thermostat {
    @Override
    protected void setTemperature(int t) {
        heat(t);
    }

    public void heat(int val) {
         temperature  += val;
    }
}
