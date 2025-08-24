public class SqlOrderRepository extends Repository {
    void save(String id){ 
        System.out.println("Saved order " + id + " to SQL"); 
    }
}
