public class Overnight extends Shipment {
    Overnight(double w) {
        super(w);
    }

    double cost() {
        return 120 + 10 * weightKg;
    }
}
