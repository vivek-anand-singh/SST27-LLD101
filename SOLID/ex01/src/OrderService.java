public class OrderService {
    private TotalWithTax totalWithTax;
    private SendMessage sm;
    private DB db;

    OrderService(DB db, SendMessage sm, TotalWithTax totalWithTax) {
        this.totalWithTax = totalWithTax;
        this.db = db;
        this.sm = sm;
    }

    void checkout(String customerEmail, double subtotal) {
        double total = totalWithTax.totalWithTax(subtotal);
        sm.send(customerEmail, "Thanks! Your total is " + total);
        db.saveOrder(customerEmail, total);
    }
}