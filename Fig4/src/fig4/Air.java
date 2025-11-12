package fig4;

import java.time.LocalDate;
public class Air implements Shipping {
    private final double baseFee;
    private final double perKg;

    public Air() {
        this.baseFee = 15.0;
        this.perKg = 4.0;
    }

    public Air(double baseFee, double perKg) {
        this.baseFee = baseFee;
        this.perKg = perKg;
    }

    @Override
    public double getCost(Order order) {
        if (order == null) throw new IllegalArgumentException("order must not be null");
        double weight = order.getTotalWeight();
        return baseFee + (perKg * weight);
    }

    @Override
    public LocalDate getDeliveryDate(Order order) {
        return LocalDate.now().plusDays(2);
    }
}
