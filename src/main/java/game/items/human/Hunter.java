package game.items.human;

import game.items.Animal.*;
import game.items.parent.Human;
import game.map.Coordinates;

public class Hunter extends Human {
    public Hunter(Coordinates coordinates) {
        super(coordinates);
    }
    @Override
    public boolean canKill(Animal animal){

        return animal instanceof Rabbit ||
                animal instanceof Mouse ||
                animal instanceof Bear ||
                animal instanceof Fox;
    }
}
