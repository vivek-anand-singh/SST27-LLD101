

public class Demo01 {
    private static final double taxRate = 0.18;
    public static void main(String[] args) {
        DB db = new PrintDBService();
        SendMessage email = new EmailClient();
        TotalWithTax totalWithTax = new TotalWithTax(taxRate);
        OrderService orderService = new OrderService(db, email, totalWithTax);
        orderService.checkout("a@shop.com", 100.0);
    }
}
