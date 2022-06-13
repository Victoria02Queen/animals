package game.Animal;

import game.Coordinates;
import game.Eatable;
import game.Eater;
import game.Item;

public abstract class Animal extends Eatable implements Eater {
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
}
