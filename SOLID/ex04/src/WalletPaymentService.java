public class WalletPaymentService extends PaymentService {
    String pay(Payment p){
        return "Wallet debit: " + p.amount;
    }
}
