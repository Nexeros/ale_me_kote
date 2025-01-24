//Zad 3
public class TemperatureSensor implements Sensor {
    double temperature;
    String status;

    public TemperatureSensor(double temperature, String status) {
        this.temperature = temperature;
        this.status = status;
    }

    @Override
    public double readValue() {
        return temperature;
    }

    @Override
    public String getStatus() {
        return "Pause to read";
    }

    @Override
    public void reset() {
        this.status = "Working";
        this.temperature = 0;
    }

    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "temperature=" + temperature +
                ", status='" + status + '\'' +
                '}';
    }
}
