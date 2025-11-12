package fig4;


public final class OrderItem {
    private final String name;
    private final int quantity;
    private final double weightPerUnit;
    private final double pricePerUnit;

    public OrderItem(String name, int quantity, double weightPerUnit, double pricePerUnit) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name must not be empty");
        if (quantity <= 0) throw new IllegalArgumentException("quantity must be > 0");
        if (weightPerUnit < 0) throw new IllegalArgumentException("weightPerUnit must be >= 0");
        if (pricePerUnit < 0) throw new IllegalArgumentException("pricePerUnit must be >= 0");
        this.name = name;
        this.quantity = quantity;
        this.weightPerUnit = weightPerUnit;
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getWeightPerUnit() { return weightPerUnit; }
    public double getPricePerUnit() { return pricePerUnit; }

    public double getTotalWeight() { return weightPerUnit * quantity; }
    public double getTotalPrice() { return pricePerUnit * quantity; }

    @Override
    public String toString() {
        return String.format("%s x%d (weight=%.2fkg, unit=%.2f)", name, quantity, getTotalWeight(), pricePerUnit);
    }
}
