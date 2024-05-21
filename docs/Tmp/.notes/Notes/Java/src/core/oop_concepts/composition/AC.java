package core.oop_concepts.composition;

public class AC  extends Thermostat {
    @Override
    protected void setTemperature(int temp) {
        this.cool(temp);
    }
    public void cool(int val) {
        temperature -= val;
    }
}
