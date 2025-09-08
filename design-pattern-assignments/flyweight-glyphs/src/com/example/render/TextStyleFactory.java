package com.example.render;

import java.util.HashMap;
import java.util.Map;

public class TextStyleFactory {
    private static Map<String, TextStyle> styles = new HashMap<>();

    public static TextStyle getStyle(String font, int size, boolean bold) {
        String key = font + size + bold;
        if (!styles.containsKey(key)) {
            styles.put(key, new TextStyle(font, size, bold));
        }
        return styles.get(key);
    }
}
