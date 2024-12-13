import java.util.Objects;

public class Procssor {
    double frequency;
    int cores;
    String manufacturer;
    public Procssor(double frequency, int cores, String manufacturer) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Procssor procssor = (Procssor) o;
        return Double.compare(frequency, procssor.frequency) == 0 && cores == procssor.cores && Objects.equals(manufacturer, procssor.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frequency, cores, manufacturer);
    }

    @Override
    public String toString() {
        return "Procssor{" +
                "frequency=" + frequency +
                ", cores=" + cores +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
