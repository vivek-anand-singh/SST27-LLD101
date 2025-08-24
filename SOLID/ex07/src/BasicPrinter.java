public class BasicPrinter extends Machine implements Printer {
    public void print(String text) {
        System.out.println("Printing: " + text);
    }

    public void doWork() {
        System.out.println("BasicPrinter is working");
    }
}