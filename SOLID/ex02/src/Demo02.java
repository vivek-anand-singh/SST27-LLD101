public class Demo02 {
    public static void main(String[] args) {
        CacheService cacheService = new CacheService();
        Decoder decoder = new TextDecoder();
        Player player = new Player(cacheService, decoder);
        player.play(new byte[]{1,2,3,4});
    }
}
