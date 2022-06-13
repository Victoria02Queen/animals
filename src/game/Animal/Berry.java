package game.Animal;

import game.Coordinates;
import game.Eatable;
import game.Item;

public class Berry extends Eatable  {
    @Override
    public int getFoodLevelIncreasing() {
        return 1;
    }

    public Berry(Coordinates coordinates){

        super(coordinates, 1);
    }
}
