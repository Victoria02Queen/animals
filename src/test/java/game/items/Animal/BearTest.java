package game.items.Animal;

import game.map.Coordinates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BearTest {

    @Test
    void EatFoxTest() {
        Bear bear = new Bear(new Coordinates(2,3),7,6,3,1);
        Fox  fox = new Fox(new Coordinates(1,2),4,6,13,1);
        int meet = bear.getFoodLevel();
        bear.eat(fox);
        int meet2 = bear.getFoodLevel();
        int finalFoodLevel = meet + fox.getFoodLevelIncreasing();
        assertFalse(fox.isAlive());
        assertEquals(finalFoodLevel, meet2);
    }
    @Test
    void canEatAnimal() {
        Bear bear = new Bear(new Coordinates(2,3),7,6,3,1);
        Rabbit rabbit = new Rabbit(new Coordinates(1,2),2,6,1);
        Mouse mouse = new Mouse(new Coordinates(2,3),3,4,6,2);
        assertTrue(bear.canEat(rabbit));
        assertFalse(bear.canEat(mouse));
    }
}