public class Crow extends Bird implements Flyable {

    @Override
    public void flaps() {
        System.out.println("Crow flaps!");
    }

    @Override
    public void fly() {
        System.out.println("Crow flies!");
    }
}
