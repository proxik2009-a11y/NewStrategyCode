package com.company;

public abstract class Unit {
    protected int health;
    protected int attack;
    protected int armour;

    public Unit(int health, int attack, int armour) {
        this.health = health;
        this.attack = attack;
        this.armour = armour;
    }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = Math.max(0, health); }

    public int getAttack() { return attack; }
    public void setAttack(int attack) { this.attack = attack; }

    public int getArmour() { return armour; }
    public void setArmour(int armour) { this.armour = armour; }

    public void attack(Unit enemy) {
        if (enemy == null) return;
        int damage = Math.max(0, this.attack - enemy.getArmour());
        enemy.setHealth(enemy.getHealth() - damage);
    }
}
