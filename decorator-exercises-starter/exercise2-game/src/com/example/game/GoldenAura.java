package com.example.game;

public class GoldenAura extends CharacterDecorator {

    public GoldenAura(Character wrapped) {
        super(wrapped);
    }

    @Override
    public void move() {
        System.out.println("Moving with golden aura! Current speed: " + getSpeed() + ", Sprite: " + getSprite());
    }

    @Override
    public int getSpeed() {
        return wrapped.getSpeed() + 5; 
    }

    @Override
    public String getSprite() {
        return "Golden Aura";
    }
}
