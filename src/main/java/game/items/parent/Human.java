package game.items.parent;

import game.items.Animal.Animal;
import game.items.abilities.MovableItem;
import game.map.Coordinates;

public abstract class Human extends MovableItem {
    public Human(Coordinates coordinates, int distance) {
        super(coordinates,distance);
    }

    public void kill(Item item){
        if (!(item instanceof Animal)){
            return;
        }
        Animal animal = (Animal) item;
        if (canKill(animal)){
            animal.kill();
        }
    }
    public abstract boolean canKill(Animal animal);
}
