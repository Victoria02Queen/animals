package game.items.parent;

import game.items.Animal.Animal;
import game.items.Animal.Bear;
import game.items.Animal.Mouse;
import game.items.Animal.Rabbit;
import game.items.human.Hunter;
import game.items.plant.Berry;
import game.map.Coordinates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void killRabbitTest() {
        Hunter hunter = new Hunter(new Coordinates(3,4));
        Rabbit rabbit = new Rabbit(new Coordinates(2,1), 4,6,7);
        hunter.kill(rabbit);
        assertFalse(rabbit.isAlive());
    }

    @Test
    void killNotSupportedAnimalTest() {
        Hunter hunter = new Hunter(new Coordinates(3,4));
        Animal animal = new Animal(new Coordinates(2,2),4,3,6) {
            @Override
            public boolean canEat(Item item) {
                return false;
            }

            @Override
            public int getFoodLevelIncreasing() {
                return 0;
            }
        };
        hunter.kill(animal);
        assertTrue(animal.isAlive());
    }

    @Test
    void killNotAnimalTest() {
        Hunter hunter = new Hunter(new Coordinates(3,4));
        Berry berry = new Berry(new Coordinates(1,2));
        hunter.kill(berry);
        assertTrue(berry.isAlive());
    }
}