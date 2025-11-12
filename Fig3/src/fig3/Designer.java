package fig3;

public class Designer implements Employee {
    private final String name;

    public Designer() {
        this("Designer");
    }

    public Designer(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println(name + ": creating visual assets and UI mockups");
    }
}
