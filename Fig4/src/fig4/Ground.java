package fig4;

import java.time.LocalDate;

public class Ground implements Shipping {
    @Override
    public double getCost(Order order) {
        if (order == null) throw new IllegalArgumentException("order must not be null");
        double total = order.getTotal();
        if (total > 100.0) return 0.0;
        double cost = 1.5 * order.getTotalWeight();
        return Math.max(10.0, cost);
    }

    @Override
    public LocalDate getDeliveryDate(Order order) {
        return LocalDate.now().plusDays(5);
    }
}
