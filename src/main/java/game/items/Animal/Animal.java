package game.items.Animal;

import game.items.abilities.Movable;
import game.map.Coordinates;
import game.items.parent.Eatable;
import game.items.parent.Item;

public abstract class Animal extends Eatable implements Movable {
    private int foodLevel;
    private int speedLevel;
    public  int distance;

    public Animal(Coordinates coordinates, int foodLevel, int healthLevel, int speedLevel, int distance) {
        super(coordinates, healthLevel);
        this.foodLevel = foodLevel;
        this.speedLevel = speedLevel;
        this.distance = distance;
    }
    @Override
    public int getDistance(){
        return distance;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public void setFoodLevel(int foodLevel) {
        this.foodLevel = foodLevel;
    }

    public int getSpeedLevel() {
        return speedLevel;
    }

    public void setSpeedLevel(int speedLevel) {
        this.speedLevel = speedLevel;
    }

    public boolean eat(Item item){
        if (canEat(item)) {
            Eatable eatable = (Eatable) item;
            setFoodLevel(getFoodLevel() + eatable.getFoodLevelIncreasing());
            eatable.kill();
            return true;
        }
        return false;
    }

    public abstract boolean canEat(Item item);
}
