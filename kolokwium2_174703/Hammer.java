//Zad 2
public class Hammer extends WorkTool{
    public Hammer(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    public void use() {
        System.out.println("Hammer: " + name + " in use");
    }

    @Override
    public String toString() {
        return "Hammer{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
