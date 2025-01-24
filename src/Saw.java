//Zad 2
public class Saw extends WorkTool{
    public Saw(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    public void use() {
        System.out.println("Saw: " + name + " in use");
    }

    @Override
    public String toString() {
        return "Saw{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
