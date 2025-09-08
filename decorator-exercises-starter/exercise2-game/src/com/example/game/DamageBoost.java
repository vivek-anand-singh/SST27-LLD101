package com.example.game;

public class DamageBoost extends CharacterDecorator {
    private final int damageIncrease;

    public DamageBoost(Character wrapped, int damageIncrease) {
        super(wrapped);
        this.damageIncrease = damageIncrease;
    }

    @Override
    public void attack() {
        System.out.println("Attacking with damage boost! Current damage: " + getDamage() + ", Sprite: " + getSprite());
    }

    @Override
    public int getDamage() {
        return wrapped.getDamage() + damageIncrease;
    }
}
