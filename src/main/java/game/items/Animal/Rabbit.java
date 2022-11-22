package game.items.Animal;

import game.map.Coordinates;
import game.items.parent.Item;
import game.items.plant.Berry;

public class Rabbit extends Animal{

    public Rabbit(Coordinates coordinates, int foodLevel, int healthLevel, int speedLevel) {
        super(coordinates, foodLevel, healthLevel, speedLevel);
    }
    public boolean canEat(Item item){
        return item instanceof Berry;
    }

    @Override
    public int getFoodLevelIncreasing() {
        return 4;
    }
}
