public class OrderController {
    Repository repo;
    OrderController(Repository repo){
        this.repo = repo;
    }
    void create(String id){
        repo.save(id);
        System.out.println("Created order: " + id);
    }
}