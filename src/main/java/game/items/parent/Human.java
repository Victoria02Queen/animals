package game.items.parent;

import game.items.Animal.Animal;
import game.items.Animal.Rabbit;
import game.map.Coordinates;

public abstract class Human extends Item {
    public Human(Coordinates coordinates) {
        super(coordinates);
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
