package fig4;

import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println("--- Fig4 Shipping Demo ---");

        Order order = new Order();
        order.addItem(new OrderItem("Widget", 3, 2.5, 19.99));
        order.addItem(new OrderItem("Gadget", 1, 1.2, 59.50));

        System.out.println("Order total: " + String.format("%.2f", order.getTotal()));
        System.out.println("Order weight: " + String.format("%.2f", order.getTotalWeight()) + " kg");

        order.setShipping(new Ground());
        System.out.println("Using Ground shipping -> cost: " + String.format("%.2f", order.getShippingCost())
                + ", eta: " + order.getEstimatedDeliveryDate().format(f));

        order.setShipping(new Air());
        System.out.println("Using Air shipping    -> cost: " + String.format("%.2f", order.getShippingCost())
                + ", eta: " + order.getEstimatedDeliveryDate().format(f));

        System.out.println("--- Demo complete ---");
    }
}
