public class Demo03 {
    public static void main(String[] args) {
        ShippingCostCalculator calc = new ShippingCostCalculator();
        Shipment s1 = new Standard(10);
        System.out.println("cost of s1=" + calc.cost(s1));
        Shipment s2 = new Express(10);
        System.out.println("cost of s2=" + calc.cost(s2));
        Shipment s3 = new Overnight(10);
        System.out.println("cost of s3=" + calc.cost(s3));
    }
}
