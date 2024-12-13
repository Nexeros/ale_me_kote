public record Car(String brand, String model, int fuelConsumptionPer100km) {
    public double fuelCost(double fuelPrice, double distance) {
        return ((double) fuelConsumptionPer100km / 100)*distance*fuelPrice;
    }
}
