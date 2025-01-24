//Zad 2
public class Screwdriver extends WorkTool{
    public Screwdriver(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    public void use() {
        System.out.println("Screwdriver: " + name + " in use");
    }

    @Override
    public String toString() {
        return "Screwdriver{" +
                "productionYear=" + productionYear +
                ", name='" + name + '\'' +
                '}';
    }
}
