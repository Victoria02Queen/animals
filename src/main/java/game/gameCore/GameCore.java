package game.gameCore;

import game.map.Factory;
import game.map.Map;
import game.util.ApplicationSettings;

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


        int value = applicationSettings.getIntegerSetting("countHunters");
        System.out.println(value);
    }
}
