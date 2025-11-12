package fig3;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Fig3 UML Implementation Demo ---");

        Company gameDev = new GameDevCompany();
        gameDev.createSoftware();

        Company outsourcing = new OutsourcingCompany();
        outsourcing.createSoftware();

        System.out.println("--- Demo complete ---");
    }
}
