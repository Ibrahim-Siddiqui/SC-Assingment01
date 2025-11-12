package fig4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.time.LocalDate;


public class Order {
    private final List<OrderItem> lineItems = new ArrayList<>();
    private Shipping shipping;

    public Order() { }

    public void addItem(OrderItem item) {
        if (item == null) throw new IllegalArgumentException("item must not be null");
        lineItems.add(item);
    }

    public List<OrderItem> getLineItems() { return Collections.unmodifiableList(lineItems); }

    public double getTotal() {
        return lineItems.stream().mapToDouble(OrderItem::getTotalPrice).sum();
    }

    public double getTotalWeight() {
        return lineItems.stream().mapToDouble(OrderItem::getTotalWeight).sum();
    }

    public void setShipping(Shipping shipping) { this.shipping = shipping; }

    public Shipping getShipping() { return shipping; }

    public double getShippingCost() {
        if (shipping == null) throw new IllegalStateException("Shipping method is not set");
        return shipping.getCost(this);
    }

    public LocalDate getEstimatedDeliveryDate() {
        if (shipping == null) throw new IllegalStateException("Shipping method is not set");
        return shipping.getDeliveryDate(this);
    }
}
