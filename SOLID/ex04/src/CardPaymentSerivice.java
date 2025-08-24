public class CardPaymentSerivice extends PaymentService {
    String pay(Payment p){
        return "Charged card: " + p.amount;
    }
}
