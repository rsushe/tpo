package org.tpo.story;

public enum Destination {
    HORSES_HEAD_NEBULA("Туманность Конской Головы", 1500);

    private final String name;
    private final int lightYearsFromEarth;

    Destination(String name, int lightYearsFromEarth) {
        this.name = name;
        this.lightYearsFromEarth = lightYearsFromEarth;
    }

    public String getName() {
        return name;
    }

    public int getLightYearsFromEarth() {
        return lightYearsFromEarth;
    }
}

