package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {
    private final Decoder decoder;
    private final FilterEngine filterEngine;
    private final SharpenAdapter sharpenAdapter;
    private final Encoder encoder;
    
    public VideoPipelineFacade() {
        this.decoder = new Decoder();
        this.filterEngine = new FilterEngine();
        this.sharpenAdapter = new SharpenAdapter();
        this.encoder = new Encoder();
    }

    public Path process(Path src, Path out, boolean gray, Double scale, Integer sharpenStrength) {
        Frame[] frames = decoder.decode(src);
        frames = filterEngine.grayscale(frames);
        frames = filterEngine.scale(frames, scale);
        frames = sharpenAdapter.sharpen(frames, sharpenStrength);

        return encoder.encode(frames, out);
    }
}
