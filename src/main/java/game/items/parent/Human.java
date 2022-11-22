package game.items.parent;

import game.items.Animal.Animal;
import game.items.Animal.Rabbit;
import game.items.abilities.Movable;
import game.map.Coordinates;

public abstract class Human extends Item implements Movable {
    public int distance;
    public Human(Coordinates coordinates, int distance) {
        super(coordinates);
    }

    @Override
    public int getDistance(){
        return distance;
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
