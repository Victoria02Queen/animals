package game.Animal;

import game.Coordinates;
import game.Eatable;
import game.Item;

public class Rabbit extends Animal{

    public Rabbit(Coordinates coordinates, int foodLevel, int healthLevel, int speedLevel) {
        super(coordinates, foodLevel, healthLevel, speedLevel);
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

    @Override
    public int getFoodLevelIncreasing() {
        return 4;
    }
}
