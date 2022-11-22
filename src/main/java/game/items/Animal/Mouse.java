package game.items.Animal;

import game.map.Coordinates;
import game.items.parent.Item;
import game.items.plant.Berry;

public class Mouse extends Animal{
    public int distance;
    public Mouse(Coordinates coordinates, int foodLevel, int healthLevel, int speedLevel,int distance) {
        super(coordinates, foodLevel, healthLevel, speedLevel,distance);
    }

    @Override
    public int getFoodLevelIncreasing() {
        return 5;
    }

    public boolean canEat(Item item){
        return item instanceof Berry;
    }
}
