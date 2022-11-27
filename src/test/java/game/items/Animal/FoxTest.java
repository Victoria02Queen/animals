package game.items.Animal;

import game.map.Coordinates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoxTest {

    @Test
    void EatRabbitTest() {
        Fox  fox = new Fox(new Coordinates(1,2),4,6,13,4);
        Rabbit rabbit = new Rabbit(new Coordinates(2,3),7,6,3,2);
        int meet = fox.getFoodLevel();
        fox.eat(rabbit);
        int meet2 = fox.getFoodLevel();
        int finalFoodLevel = meet + rabbit.getFoodLevelIncreasing();
        assertFalse(rabbit.isAlive());
        assertEquals(finalFoodLevel, meet2);
    }
    @Test
    void canEatAnimal() {
        Fox  fox = new Fox(new Coordinates(1,2),4,6,13,1);
        Rabbit rabbit = new Rabbit(new Coordinates(2,3),7,6,3,2);
        Mouse mouse = new Mouse(new Coordinates(2,3),3,4,6,2);
        assertTrue(fox.canEat(rabbit));
        assertFalse(fox.canEat(mouse));
    }
}