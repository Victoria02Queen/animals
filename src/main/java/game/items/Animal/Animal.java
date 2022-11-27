package game.items.Animal;

import game.items.abilities.MovableItem;
import game.map.Coordinates;
import game.items.parent.Eatable;
import game.items.parent.Item;

public abstract class Animal extends MovableItem implements Eatable {
    private int foodLevel;
    private int speedLevel;
    private int healthLevel;


    public Animal(Coordinates coordinates, int foodLevel, int healthLevel, int speedLevel, int distance) {
        super(coordinates, distance);
        this.foodLevel = foodLevel;
        this.speedLevel = speedLevel;
        this.healthLevel = healthLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public boolean isAlive() {
        return healthLevel > 0;
    }

    public void kill(){
        healthLevel = 0;
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
