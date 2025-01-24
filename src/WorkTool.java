//Zad 2
public abstract class WorkTool {
    String name;
    int productionYear;

    public WorkTool(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    public abstract void use();
}
