package com.company;

public class Archer extends Unit {
    public Archer() {
        super(8, 4, 0);
    }

    public void piercingShot(Unit enemy) {
        if (enemy == null) return;
        enemy.setHealth(enemy.getHealth() - this.attack);
    }
}