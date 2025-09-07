import com.example.orders.*;
import java.util.List;

public class TryIt {
    public static void main(String[] args) {
        OrderLine l1 = new OrderLine("A", 1, 200);
        OrderLine l2 = new OrderLine("B", 3, 100);

        Order o = new Order.Builder()
                .id("o2")
                .customerEmail("a@b.com")
                .addLine(l1.getSku(), l1.getQuantity(), l1.getUnitPriceCents())
                .addLine(l2.getSku(), l2.getQuantity(), l2.getUnitPriceCents())
                .build();

        System.out.println("Before: " + o.totalAfterDiscount());
        l1.setQuantity(999); // demonstrates mutability leak
        System.out.println("After:  " + o.totalAfterDiscount());
        System.out.println("=> In the solution, totals remain stable due to defensive copies.");
    }
}
