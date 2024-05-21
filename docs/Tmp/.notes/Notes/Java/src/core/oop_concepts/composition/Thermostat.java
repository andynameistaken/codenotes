package core.oop_concepts.composition;

public abstract class Thermostat {
    protected static int temperature = 0;

abstract protected void setTemperature(int temperature);

    public int getTemperature() {
        return temperature;
    }

}
