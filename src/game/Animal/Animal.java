package game.Animal;

import game.Coordinates;
import game.Eatable;
import game.Item;

public abstract class Animal extends Eatable {
    private int foodLevel;
    private int speedLevel;

    public Animal(Coordinates coordinates, int foodLevel, int healthLevel, int speedLevel) {
        super(coordinates, healthLevel);
        this.foodLevel = foodLevel;
        this.speedLevel = speedLevel;
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
        if (isEatable(item)) {
            Eatable eatable = (Eatable) item;
            setFoodLevel(getFoodLevel() + eatable.getFoodLevelIncreasing());
            eatable.kill();
            return true;
        }
        return false;
    }

    public abstract boolean isEatable(Item item);
}
