public class UPIPaymentService extends PaymentService {
    String pay(Payment p){
        return "Paid via UPI: " + p.amount;
    }
}
