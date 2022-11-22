package game.items.plant;

import game.map.Coordinates;
import game.items.parent.Eatable;

public class Berry extends Eatable  {
    @Override
    public int getFoodLevelIncreasing() {
        return 1;
    }

    public Berry(Coordinates coordinates){

        super(coordinates, 1);
    }
}
