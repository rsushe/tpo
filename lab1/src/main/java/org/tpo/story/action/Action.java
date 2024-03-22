package org.tpo.story.action;

import org.tpo.story.Person;

public abstract class Action {
    protected final Person firstActingPerson;

    public Action(Person firstActingPerson) {
        this.firstActingPerson = firstActingPerson;
    }

    public final void process() {
        start();
        consequences();
    }

    public abstract void start();

    public void consequences() {}

    public Person getFirstActingPerson() {
        return firstActingPerson;
    }
}
