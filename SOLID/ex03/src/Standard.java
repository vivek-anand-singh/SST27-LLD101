public class Standard extends Shipment {
    Standard(double weightKg) {
        super(weightKg);
    }

    double cost() {
        return 50 + 5 * weightKg;
    }
}
