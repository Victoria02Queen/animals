package game.items.Animal;

import game.map.Coordinates;
import game.items.parent.Item;
import game.items.plant.Berry;

public class Rabbit extends Animal{
    public int distance;
    public Rabbit(Coordinates coordinates, int foodLevel, int healthLevel, int speedLevel, int distance) {
        super(coordinates, foodLevel, healthLevel, speedLevel,distance);
    }
    public boolean canEat(Item item){
        return item instanceof Berry;
    }

    @Override
    public int getFoodLevelIncreasing() {
        return 4;
    }
}
