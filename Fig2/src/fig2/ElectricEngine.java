package fig2;


public class ElectricEngine implements Engine {
    private final int batteryPercent;

    public ElectricEngine(int batteryPercent) {
        this.batteryPercent = Math.max(0, Math.min(100, batteryPercent));
    }

    @Override
    public void move() {
        System.out.println("ElectricEngine: humming softly. Battery=" + batteryPercent + "%");
        System.out.println("ElectricEngine: vehicle is moving (electric)");
    }
}
