public class Express extends Shipment {
    Express(double w) {
        super(w);
    }

    double cost() {
        return 80 + 8 * weightKg;
    }

    
}
