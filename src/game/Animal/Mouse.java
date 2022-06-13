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

    public boolean isEatable(Item item){
        return item instanceof Berry ;
    }
}
