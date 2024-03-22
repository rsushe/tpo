package org.tpo.story;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tpo.story.action.Action;
import org.tpo.story.action.DiscussAction;
import org.tpo.story.action.DrinkAction;
import org.tpo.story.action.ReadAction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.tpo.story.Person.IQ_WISE_DOWN_AFTER_DRINKING;
import static org.tpo.story.Person.IQ_WISE_UP_AFTER_DISCUSSION;
import static org.tpo.story.Person.IQ_WISE_UP_AFTER_READING;

public class StoryTest {
    private final int DEFAULT_IQ = 100;

    private CosmicShip cosmicShip;
    private Person zafod, ford, trillian, artur;
    private Action drinkAcion, readAction, discussAction;

    @BeforeEach
    void setUp() {
        cosmicShip = new CosmicShip("Золотое Сердце", Destination.HORSES_HEAD_NEBULA);

        zafod = new Person("Зафод", DEFAULT_IQ, Location.PALM);
        ford = new Person("Форд", DEFAULT_IQ, Location.CORNER);
        trillian = new Person("Триллиан", DEFAULT_IQ, Location.CORNER);
        artur = new Person("Артур", DEFAULT_IQ, Location.CABIN);

        drinkAcion = new DrinkAction(zafod, PangalacticDrink.BLASTER);
        readAction = new ReadAction(artur, Book.GALACTIC_GUIDEBOOK);
        discussAction = new DiscussAction(ford, trillian);
    }

    @Test
    public void testAnotherYearsInFlyPassed() {
        int currentYearsInFly = cosmicShip.getCurrentGalaxyYearsInFly();

        cosmicShip.anotherYearsInFlyPassed(100);

        assertEquals(currentYearsInFly + 100, cosmicShip.getCurrentGalaxyYearsInFly());
    }

    @Test
    public void testFlyToDestination() {
        int currentYearsInFly = cosmicShip.getCurrentGalaxyYearsInFly();

        cosmicShip.anotherYearsInFlyPassed(cosmicShip.getDestination().getLightYearsFromEarth() - currentYearsInFly + 1);

        assertTrue(cosmicShip.isInDestination());
    }

    @Test
    public void testDrinkAction() {
        assertEquals(0, zafod.getDrunkPercentage());
        assertEquals(DEFAULT_IQ, zafod.getIq());

        drinkAcion.process();

        assertEquals(PangalacticDrink.BLASTER.getAlcoholContent(), zafod.getDrunkPercentage());
        assertEquals(DEFAULT_IQ - IQ_WISE_DOWN_AFTER_DRINKING, zafod.getIq());
    }

    @Test
    public void testReadAction() {
        assertEquals(DEFAULT_IQ, artur.getIq());

        readAction.process();

        assertEquals(DEFAULT_IQ + IQ_WISE_UP_AFTER_READING, artur.getIq());
    }

    @Test
    public void testDiscussAction() {
        assertEquals(DEFAULT_IQ, ford.getIq());
        assertEquals(DEFAULT_IQ, trillian.getIq());

        discussAction.process();

        assertEquals(DEFAULT_IQ + IQ_WISE_UP_AFTER_DISCUSSION, ford.getIq());
        assertEquals(DEFAULT_IQ + IQ_WISE_UP_AFTER_DISCUSSION, trillian.getIq());
    }
}
