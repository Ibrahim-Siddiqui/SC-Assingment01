package fig2;


public class Main {
    public static void main(String[] args) {
        System.out.println("--- Fig2 UML Implementation Demo ---");

        Engine combustion = new CombustionEngine("diesel");
        Driver human = new Human("Alice");
        Transport truck = new Transport(combustion, human);
        truck.deliver("Warehouse A", "Pallet #42");

        System.out.println();

        Engine electric = new ElectricEngine(88);
        Driver robot = new Robot("R2-D2");
        Transport drone = new Transport(electric, robot);
        drone.deliver("Distribution Center", "Medical supplies");

        System.out.println("--- Demo complete ---");
    }
}
