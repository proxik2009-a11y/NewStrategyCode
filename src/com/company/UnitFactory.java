package com.company;

public class UnitFactory {
    public static Unit createUnit(String type) {
        switch (type.toLowerCase()) {
            case "archer":
                return new Archer();
            case "spearman":
                return new Spearman();
            case "horseman":
                return new Horseman();
            default:
                throw new IllegalArgumentException("Неизвестный тип юнита: " + type);
        }
    }
}

