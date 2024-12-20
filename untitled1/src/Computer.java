import java.util.Objects;

public class Computer {
    String brand;
    String model;
    Procssor procssor;

    public Computer(String brand, String model, Procssor procssor) {
        this.brand = brand;
        this.model = model;
        this.procssor = procssor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Procssor getProcssor() {
        return procssor;
    }

    public void setProcssor(Procssor procssor) {
        this.procssor = procssor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(brand, computer.brand) && Objects.equals(model, computer.model) && Objects.equals(procssor, computer.procssor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, procssor);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", procssor=" + procssor +
                '}';
    }
}
