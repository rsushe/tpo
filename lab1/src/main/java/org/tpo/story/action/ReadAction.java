package org.tpo.story.action;

import org.tpo.story.Book;
import org.tpo.story.Person;

public class ReadAction extends Action {
    private final Book guidebook;

    public ReadAction(Person person, Book guidebook) {
        super(person);
        this.guidebook = guidebook;
    }

    @Override
    public void start() {
        super.firstActingPerson.readGuide(guidebook);
    }
}
