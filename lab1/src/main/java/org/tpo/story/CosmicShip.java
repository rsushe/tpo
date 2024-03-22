package org.tpo.story;

public class CosmicShip {
    private final String name;
    private int currentGalaxyYearsInFly;
    private boolean inDestination;
    private final Destination destination;

    public CosmicShip(String name, Destination destination) {
        this.name = name;
        this.currentGalaxyYearsInFly = 0;
        this.inDestination = false;
        this.destination = destination;
    }

    public void anotherYearsInFlyPassed(int yearsPassed) {
        currentGalaxyYearsInFly += yearsPassed;

        if (currentGalaxyYearsInFly >= destination.getLightYearsFromEarth()) {
            System.out.printf("Ура! Мы наконец-то долетели до нашей цели %s! Но на это ушло ни много ни мало %d лет! " +
                              "Сколько же всего изменилось в нашей галактике...",
                destination.getName(), destination.getLightYearsFromEarth());
            this.inDestination = true;
            return;
        }

        System.out.printf("Уже прошло %d световых лет, а мы все летим, и летим... Но мы не унываем духом!" +
                          "Мы верим, что обязательно прибудем к нашей цели!", currentGalaxyYearsInFly);
    }

    public String getName() {
        return name;
    }

    public Destination getDestination() {
        return destination;
    }

    public boolean isInDestination() {
        return inDestination;
    }

    public int getCurrentGalaxyYearsInFly() {
        return currentGalaxyYearsInFly;
    }
}
