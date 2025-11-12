package fig2;

public class CombustionEngine implements Engine {
    private final String fuelType;

    public CombustionEngine(String fuelType) {
        this.fuelType = fuelType == null ? "gasoline" : fuelType;
    }

    @Override
    public void move() {
        System.out.println("CombustionEngine: roaring to life using " + fuelType + "...");
        System.out.println("CombustionEngine: vehicle is moving (combustion)");
    }
}
