package fig4;

import java.time.LocalDate;

public interface Shipping {
  
    double getCost(Order order);

    LocalDate getDeliveryDate(Order order);
}
