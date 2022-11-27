package game.items.plant;

import game.items.parent.Item;
import game.map.Coordinates;
import game.items.parent.Eatable;

public class Berry extends Item implements Eatable {

    boolean eaten = false;
    @Override
    public int getFoodLevelIncreasing() {
        return 1;
    }

    @Override
    public void kill() {
        eaten = true;
    }

    @Override
    public boolean isAlive() {
        return eaten;
    }

    public Berry(Coordinates coordinates){

        super(coordinates);
    }

}
