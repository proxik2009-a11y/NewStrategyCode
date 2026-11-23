package com.company;

import java.util.ArrayList;

public class Squad {
    private ArrayList<Unit> units = new ArrayList<>();

    public void addUnit(Unit unit) {
        if (unit != null) {
            units.add(unit);
        }
    }

    public int totalStrength() {
        int total = 0;
        for (Unit unit : units) {
            total += unit.getAttack();
        }
        return total;
    }
}