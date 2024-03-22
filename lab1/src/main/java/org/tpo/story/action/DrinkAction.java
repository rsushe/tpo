package org.tpo.story.action;

import org.tpo.story.PangalacticDrink;
import org.tpo.story.Person;

import static org.tpo.story.Person.IQ_WISE_DOWN_AFTER_DRINKING;

public class DrinkAction extends Action {
    private final PangalacticDrink pangalacticDrink;

    public DrinkAction(Person person, PangalacticDrink pangalacticDrink) {
        super(person);
        this.pangalacticDrink = pangalacticDrink;
    }

    @Override
    public void start() {
        System.out.printf(
            "Человек %s решил разместиться в уютном местечке под названием %s и бахнуть там вкуснейшего напитка под " +
            "названием %s",
            super.firstActingPerson.getName(),
            super.firstActingPerson.getLocation().getName(),
            pangalacticDrink.getName()
        );

        super.firstActingPerson.drink(pangalacticDrink);
    }

    @Override
    public void consequences() {
        System.out.printf("Но, к сожалению, опьянение никогда не ведет ни к чему хорошему. Человек %s стал немножко " +
                          "глупее, но, возможно, осознаннее", super.firstActingPerson.getName());
        super.firstActingPerson.wiseDown(IQ_WISE_DOWN_AFTER_DRINKING);
    }
}
