package fig3;

public class Programmer implements Employee {
    private final String name;

    public Programmer() {
        this("Programmer");
    }

    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println(name + ": implementing features and fixing bugs");
    }
}
