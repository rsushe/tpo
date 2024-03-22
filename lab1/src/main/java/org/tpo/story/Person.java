package org.tpo.story;

import java.util.Objects;

public class Person {
    public static final int IQ_WISE_UP_AFTER_DISCUSSION = 4;
    public static final int IQ_WISE_UP_AFTER_READING = 10;
    public static final int IQ_WISE_DOWN_AFTER_DRINKING = 5;

    private final String name;
    private final Location location;
    private double drunkPercentage;
    private int iq;

    public Person(String name, int iq, Location location) {
        this.name = name;
        this.iq = iq;
        this.location = location;
        this.drunkPercentage = 0;
    }

    public void drink(PangalacticDrink drink) {
        drunkPercentage += drink.getAlcoholContent();
    }

    public void discussLifeWith(Person person) {
        if (this.equals(person)) {
            throw new IllegalArgumentException("People can't discuss life with himself");
        }

        if (this.location != person.location) {
            throw new IllegalArgumentException("People can't discuss life if they are not together");
        }

        System.out.printf("Эксперт %s и эксперт %s собрались вместе в %s и начали обсуждать жизнь",
            this.name, person.name, this.location.getName());

        this.wiseUp(IQ_WISE_UP_AFTER_DISCUSSION);
        person.wiseUp(IQ_WISE_UP_AFTER_DISCUSSION);
    }

    public void readGuide(Book book) {
        System.out.printf("Человек уселся в месте под названием %s и начал листать экземпляр книги %s",
            this.getLocation().getName(), book.getTitle());

        this.wiseUp(IQ_WISE_UP_AFTER_READING);
    }

    public void wiseUp(int delta) {
        this.iq += delta;
    }

    public void wiseDown(int delta) {
        this.iq -= delta;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public double getDrunkPercentage() {
        return drunkPercentage;
    }

    public int getIq() {
        return iq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(location, person.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }
}
