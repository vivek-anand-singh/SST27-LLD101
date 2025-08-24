public class TotalWithTax {
    private double taxRate = 0.18;

    TotalWithTax(double taxRate) {
        this.taxRate = taxRate;
    }

    double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }   
}
