package com.company;

public class Horseman extends Unit {
    public Horseman() {
        super(20, 5, 1);
    }

    public void charge(Unit enemy) {
        if (enemy == null) return;
        enemy.setHealth(enemy.getHealth() - this.attack * 2);
    }
}