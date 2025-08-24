public class Demo09 {
    public static void main(String[] args) {
        Repository repo = new SqlOrderRepository();
        new OrderController(repo).create("ORD-1");
    }
}
