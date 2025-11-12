package fig3;

public class Tester implements Employee {
    private final String name;

    public Tester() {
        this("Tester");
    }

    public Tester(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println(name + ": testing the software and reporting issues");
    }
}
