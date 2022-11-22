package game.items.Animal;

import game.map.Coordinates;
import game.items.parent.Item;

public class Fox extends Animal {
    public int distance;
    public Fox(Coordinates coordinates,  int foodLevel, int healthLevel, int speedLevel, int distance) {
        super(coordinates, foodLevel, healthLevel, speedLevel,distance);
    }

    @Override
    public int getFoodLevelIncreasing() {
        return 2;
    }

   public boolean canEat(Item item){
        return item instanceof Rabbit;
   }
}
