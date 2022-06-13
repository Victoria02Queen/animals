package game.Animal;

import game.Coordinates;
import game.Eatable;
import game.Item;

public class Rabbit extends Animal{

    public Rabbit(Coordinates coordinates, int foodLevel, int healthLevel, int speedLevel) {
        super(coordinates, foodLevel, healthLevel, speedLevel);
    }
    public boolean isEatable(Item item){
        return item instanceof Berry ;
    }

    @Override
    public int getFoodLevelIncreasing() {
        return 4;
    }
}
