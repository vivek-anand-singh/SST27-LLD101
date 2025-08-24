public class PrintDBService extends DB {
    @Override
    public void saveOrder(String customerEmail, double total) {
        System.out.println("Order for " + customerEmail + " with total " + total + " saved to PrintDB (pretend DB).");
    }
}
