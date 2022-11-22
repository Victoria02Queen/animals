package game.items.parent;

import game.map.Coordinates;

public abstract class Item {
   private Coordinates coordinates;


   public Item(Coordinates coordinates) {
      this.coordinates = coordinates;
   }

   public Coordinates getCoordinates() {
      return coordinates;
   }

   public void setCoordinates(Coordinates coordinates) {
      this.coordinates = coordinates;
   }
}
