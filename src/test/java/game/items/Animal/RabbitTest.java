package game.items.Animal;

import game.items.plant.Berry;
import game.map.Coordinates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RabbitTest {

    @Test
    void EatBerryTest() {
        Rabbit rabbit = new Rabbit(new Coordinates(2,3),3,4,6,3);
        Berry berry = new Berry(new Coordinates(1,3));
        int meet = rabbit.getFoodLevel();
        rabbit.eat(berry);
        int meet2 = rabbit.getFoodLevel();
        int finalFoodLevel = meet + berry.getFoodLevelIncreasing();
        assertFalse(berry.isAlive());
        assertEquals(finalFoodLevel, meet2);
    }
}