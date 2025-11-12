package fig2;


public class Robot implements Driver {
    private final String id;

    public Robot(String id) {
        this.id = id == null ? "robot-unknown" : id;
    }

    @Override
    public boolean navigate(String destination) {
        System.out.println("Robot [" + id + "]: scanning environment and plotting course to " + destination);
        System.out.println("Robot [" + id + "]: navigation complete (autonomous)");
        return true;
    }
}
