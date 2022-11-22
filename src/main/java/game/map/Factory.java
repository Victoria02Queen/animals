package game.map;

import game.items.Animal.*;
import game.items.human.Hunter;
import game.items.plant.Berry;

import java.util.ArrayList;

public class Factory {
    public static Map createMap(int height, int width, int bears, int berries, int foxes, int mouses, int rabbits, int hunters){

        ArrayList<Coordinates> freeCoordinates = new ArrayList<>();

        Map map = new Map(height, width);

        for (int y = 0; y < map.getHeight(); y++){
            for (int x = 0; x < map.getWidth(); x++ ){
                Coordinates coordinates = new Coordinates(x, y);
                freeCoordinates.add(coordinates);
            }
        }
        for (int i = 0; i < bears; i++){
            int pos = random(0,freeCoordinates.size());
            Coordinates coordinates = freeCoordinates.get(pos);
            freeCoordinates.remove(pos);
            Bear bear = new Bear(coordinates,4,7,9);
            map.setItem(bear, coordinates);
        }
        for (int i = 0; i < foxes; i++){
            int pos = random(0,freeCoordinates.size());
            Coordinates coordinates = freeCoordinates.get(pos);
            freeCoordinates.remove(pos);
            Fox fox = new Fox(coordinates,4,5,2);
            map.setItem(fox, coordinates);
        }
        for (int i = 0; i < mouses; i++){
            int pos = random(0,freeCoordinates.size());
            Coordinates coordinates = freeCoordinates.get(pos);
            freeCoordinates.remove(pos);
            Mouse mouse = new Mouse(coordinates,2,3,4);
            map.setItem(mouse, coordinates);
        }
        for (int i = 0; i < rabbits; i++){
            int pos = random(0,freeCoordinates.size());
            Coordinates coordinates = freeCoordinates.get(pos);
            freeCoordinates.remove(pos);
            Rabbit rabbit = new Rabbit(coordinates,2,3,4);
            map.setItem(rabbit, coordinates);
        }
        for (int i = 0; i < berries; i++){
            int pos = random(0,freeCoordinates.size());
            Coordinates coordinates = freeCoordinates.get(pos);
            freeCoordinates.remove(pos);
            Berry berry = new Berry(coordinates);
            map.setItem(berry, coordinates);
        }
        for (int i = 0; i < hunters; i++){
            int pos = random(0,freeCoordinates.size());
            Coordinates coordinates = freeCoordinates.get(pos);
            freeCoordinates.remove(pos);
            Hunter hunter = new Hunter(coordinates);
            map.setItem(hunter, coordinates);
        }
        return map;
    }
    private static int random(int a, int b){
        return (int)(Math.random() * (b - a) + a);
    }

}
