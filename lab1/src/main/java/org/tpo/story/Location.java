package org.tpo.story;

public enum Location {
    PALM("небольшая пальма под мостиком"),
    CORNER("уголок"),
    CABIN("каюта");

    private final String name;

    Location(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
