public class Player {
    private Frame last;
    private CacheService cacheService;
    private Decoder decoder;

    public Player(CacheService cacheService, Decoder decoder) {
        this.cacheService = cacheService;
        this.decoder = decoder;
    }

    void play(byte[] fileBytes){
        // decode
        decoder.decode(fileBytes);
        Frame f = new Frame(fileBytes); // pretend decoding
        last = f;
        // draw UI
        f.drawUI();
        // cache
        cacheService.cache(last);
    }
}