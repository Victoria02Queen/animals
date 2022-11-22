package game.items.Animal;

import game.items.plant.Berry;
import game.map.Coordinates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MouseTest {

    @Test
    void EatBerryTest() {
        Mouse mouse = new Mouse(new Coordinates(2,3),3,4,6);
        Berry berry = new Berry(new Coordinates(1,3));
        int meet = mouse.getFoodLevel();
        mouse.eat(berry);
        int meet2 = mouse.getFoodLevel();
        int finalFoodLevel = meet + berry.getFoodLevelIncreasing();
        assertFalse(berry.isAlive());
        assertEquals(finalFoodLevel, meet2);
    }
}