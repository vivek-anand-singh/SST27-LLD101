public class Bicycle extends Vehicle implements Pedal {
    public void move() {
        System.out.println("Bicycle is moving");
    }

    public void pedal(int effort) {
        System.out.println("Pedaling with effort: " + effort);
    }
}