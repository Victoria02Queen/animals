package game.gameCore;

import game.items.abilities.MovableItem;
import game.items.parent.Item;
import game.map.Coordinates;
import game.map.Factory;
import game.map.Map;
import game.util.ApplicationSettings;

import java.util.Random;

public class GameCore {
    public static void start(){
        ApplicationSettings applicationSettings = new ApplicationSettings();

        applicationSettings.loadSettings();

        int countBears = applicationSettings.getIntegerSetting("countBears");
        int countMouse = applicationSettings.getIntegerSetting("countMouse");
        int countFox = applicationSettings.getIntegerSetting("countFox");
        int countRabbit = applicationSettings.getIntegerSetting("countRabbit");
        int countBerries = applicationSettings.getIntegerSetting("countBerries");
        int mapHeight = applicationSettings.getIntegerSetting("mapHeight");
        int mapWidth = applicationSettings.getIntegerSetting("mapWidth");
        int countHunters = applicationSettings.getIntegerSetting("countHunters");
        int distance = applicationSettings.getIntegerSetting("distanceOfMove");

        Map map = Factory.createMap(mapHeight,mapWidth, countBears, countBerries, countFox, countMouse, countRabbit,countHunters,distance);
        System.out.println(map);

    }
    private void iterate(Map map){
        for (int y = 0; y < map.getHeight(); y++){
            for (int x = 0; x < map.getWidth(); x++){
               Item item = map.getItem(new Coordinates(x, y));
            }
        }
    }

    private void doAction(Item item){
        if (item instanceof MovableItem){

        }
    }

    private void doMovement(MovableItem movableItem){
        Direction direction = Direction.getRandom();
    }
}
