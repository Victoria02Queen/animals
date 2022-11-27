package game.items.abilities;

import game.items.parent.Eatable;
import game.items.parent.Item;
import game.map.Coordinates;

public abstract class MovableItem extends Item {
     private final int distance;

     public MovableItem(Coordinates coordinates, int distance) {
          super(coordinates);
          this.distance = distance;
     }
     public int getDistance(){
         return distance;
     }
}
