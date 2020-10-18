public class Room {
    private double size;
    private int temperature;
    private boolean isAirConditioning;
    private boolean lowerTemperature;

    public Room(double size, int temperature, boolean isAirConditioning) {
        this.size = size;
        this.temperature = temperature;
        this.isAirConditioning = isAirConditioning;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isAirConditioning() {
        return isAirConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        isAirConditioning = airConditioning;
    }

    public boolean loweringTemperature() {
        if (isAirConditioning() && getTemperature() > 16) {
            setTemperature(temperature - 1);
            return true;
        } else
        return false;
    }
}
