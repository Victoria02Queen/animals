package game.Animal;

import game.Coordinates;
import game.Eatable;
import game.Item;

public class Mouse extends Animal{

    public Mouse(Coordinates coordinates, int foodLevel, int healthLevel, int speedLevel) {
        super(coordinates, foodLevel, healthLevel, speedLevel);
    }

    @Override
    public int getFoodLevelIncreasing() {
        return 5;
    }

    @Override
    public boolean eat(Item item) {
        if (item instanceof Berry) {
            Eatable eatable = (Eatable) item;
            setFoodLevel(getFoodLevel() + eatable.getFoodLevelIncreasing());
            eatable.kill();
            return true;
        }
        return false;
    }
}
