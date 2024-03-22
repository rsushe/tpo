package org.tpo.story;

public enum Destination {
    HORSES_HEAD_NEBULA("Туманность Конской Головы", 1500);

    private final String name;
    private final long lightYearsFromEarth;

    Destination(String name, long lightYearsFromEarth) {
        this.name = name;
        this.lightYearsFromEarth = lightYearsFromEarth;
    }

    public String getName() {
        return name;
    }

    public long getLightYearsFromEarth() {
        return lightYearsFromEarth;
    }
}

