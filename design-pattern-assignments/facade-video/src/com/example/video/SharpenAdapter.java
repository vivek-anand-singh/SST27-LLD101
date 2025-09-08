package com.example.video;
public class SharpenAdapter {
    private final LegacySharpen legacySharpen;
    
    public SharpenAdapter() {
        this.legacySharpen = new LegacySharpen();
    }

    public Frame[] sharpen(Frame[] frames, int strength) {
        String framesHandle = convertFramesToHandle(frames);
        String sharpenedHandle = legacySharpen.applySharpen(framesHandle, strength);
        return convertHandleToFrames(sharpenedHandle, frames);
    }

    private String convertFramesToHandle(Frame[] frames) {
        return "FRAMES_HANDLE:" + frames.length;
    }
    
    private Frame[] convertHandleToFrames(String handle, Frame[] originalFrames) {
        return originalFrames;
    }
}
