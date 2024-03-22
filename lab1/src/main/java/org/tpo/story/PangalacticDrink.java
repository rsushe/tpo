package org.tpo.story;

public enum PangalacticDrink {
    BLASTER("пангалактического бульк-бластера", 12);

    private final String name;
    private final double alcoholContent;

    PangalacticDrink(String name, double alcoholContent) {
        this.name = name;
        this.alcoholContent = alcoholContent;
    }

    public String getName() {
        return name;
    }

    public double getAlcoholContent() {
        return alcoholContent;
    }
}
