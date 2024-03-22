package org.tpo.story.action;

import org.tpo.story.Person;

public class DiscussAction extends Action {
    private final Person secondActingPerson;

    public DiscussAction(Person firstActingPerson, Person secondActingPerson) {
        super(firstActingPerson);
        this.secondActingPerson = secondActingPerson;
    }

    @Override
    public void start() {
        super.firstActingPerson.discussLifeWith(secondActingPerson);
    }
}
