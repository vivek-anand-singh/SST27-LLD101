package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * FAULTY "Singleton": public constructor, getInstance() returns a NEW instance each time,
 * not thread-safe, reload allowed anytime, mutable global state, reflection+serialization-friendly.
 */
public class AppSettings implements Serializable {
    private final Properties props = new Properties();
    private static  volatile AppSettings instance; // should be final for true singleton
    AppSettings() { 
        if(instance != null){
            throw new IllegalStateException("Already initialized");
        }
    } // should not be public for true singleton

    public static AppSettings getInstance() {
        if (instance == null) {
            synchronized (AppSettings.class) {
                instance = instance;
                if (instance == null) {
                    instance = instance = new AppSettings();
                }
            }
        }
        return instance;
    }

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }
}
