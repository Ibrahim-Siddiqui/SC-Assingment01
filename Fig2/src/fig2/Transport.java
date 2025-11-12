package fig2;

import java.util.Objects;

public class Transport {
    private final Engine engine;
    private final Driver driver;

    public Transport(Engine engine, Driver driver) {
        this.engine = Objects.requireNonNull(engine, "engine must not be null");
        this.driver = Objects.requireNonNull(driver, "driver must not be null");
    }

    
    public boolean deliver(String destination, String cargo) {
        if (destination == null || cargo == null) {
            throw new IllegalArgumentException("destination and cargo must be non-null");
        }

        System.out.println("Transport: Preparing delivery of '" + cargo + "' to " + destination);
        boolean navOk = driver.navigate(destination);
        if (!navOk) {
            System.out.println("Transport: navigation failed — aborting delivery");
            return false;
        }

        engine.move();
        System.out.println("Transport: Delivered '" + cargo + "' to " + destination);
        return true;
    }
}
