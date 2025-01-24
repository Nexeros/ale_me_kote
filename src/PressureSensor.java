//Zad 3
public class PressureSensor implements Sensor{
    double pressure;
    String status;

    public PressureSensor(double pressure, String status) {
        this.pressure = pressure;
        this.status = status;
    }

    @Override
    public double readValue() {
        return pressure;
    }

    @Override
    public String getStatus() {
        return "Pause to read";
    }

    @Override
    public void reset() {
        this.status = "Working";
        this.pressure = 0;
    }

    @Override
    public String toString() {
        return "PressureSensor{" +
                "pressure=" + pressure +
                ", status='" + status + '\'' +
                '}';
    }
}
