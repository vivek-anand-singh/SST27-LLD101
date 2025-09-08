package com.example.game;

public class SpeedBoost extends CharacterDecorator {
    private final int speedIncrease;

    public SpeedBoost(Character wrapped, int speedIncrease) {
        super(wrapped);
        this.speedIncrease = speedIncrease;

    }

    @Override
    public void move() {
        System.out.println("Moving with speed boost! Current speed: " + getSpeed() + ", Sprite: " + getSprite());
    }

    @Override
    public int getSpeed() {
        return wrapped.getSpeed() + speedIncrease;
    }
}