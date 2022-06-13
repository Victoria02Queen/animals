package game.Animal;

import game.Coordinates;
import game.Eatable;
import game.Item;

public class Fox extends Animal {

    public Fox(Coordinates coordinates,  int foodLevel, int healthLevel, int speedLevel) {
        super(coordinates, foodLevel, healthLevel, speedLevel);
    }

    @Override
    public int getFoodLevelIncreasing() {
        return 2;
    }

    @Override
    public boolean eat(Item item) {
        if (item instanceof Rabbit) {
            Eatable eatable = (Eatable) item;
            setFoodLevel(getFoodLevel() + eatable.getFoodLevelIncreasing());
            eatable.kill();
            return true;
        }
        return false;
    }
}
