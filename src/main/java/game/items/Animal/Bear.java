package game.items.Animal;

import game.items.abilities.Movable;
import game.map.Coordinates;
import game.items.parent.Item;
import game.items.plant.Berry;

public class Bear extends Animal {
    public int distance;
    public Bear(Coordinates coordinates, int foodLevel, int healthLevel, int speedLevel, int distance) {
        super(coordinates, foodLevel, healthLevel, speedLevel,distance);
    }

//    @Override
//    public boolean eat(Item item) {
//        if (item instanceof Rabbit || item instanceof Fox || item instanceof Berry) {
//           Eatable eatable = (Eatable) item;
//           setFoodLevel(getFoodLevel() + eatable.getFoodLevelIncreasing());
//           eatable.kill();
//           return true;
//        }
//        return false;
//    }

    public boolean canEat(Item item){
        return item instanceof Rabbit || item instanceof Fox || item instanceof Berry;
    }

    @Override
    public int getFoodLevelIncreasing() {
        return 3;
    }
}
