package fig2;


public class Human implements Driver {
    private final String name;

    public Human(String name) {
        this.name = name == null ? "Driver" : name;
    }

    @Override
    public boolean navigate(String destination) {
        System.out.println(name + ": checking map and heading to " + destination);
        System.out.println(name + ": arrived at " + destination);
        return true;
    }
}
