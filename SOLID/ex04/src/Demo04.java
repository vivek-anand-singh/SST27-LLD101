
public class Demo04 {
    public static void main(String[] args) {
        PaymentService ps = new CardPaymentSerivice();
        Payment p = new Payment(499);
        String result = ps.pay(p);
        System.out.println(result);
    }
}
