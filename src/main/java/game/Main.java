package game;

import game.items.human.Hunter;
import game.map.Coordinates;
import game.map.Factory;
import game.map.Map;
import game.util.ApplicationSettings;

public class Main {
    public static void main(String[] args) {
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

        Map map = Factory.createMap(mapHeight,mapWidth, countBears, countBerries, countFox, countMouse, countRabbit,countHunters);

        System.out.println(map);


        int value = applicationSettings.getIntegerSetting("countHunters");
        System.out.println(value);
    }
//
//         try {
//             FileReader fileReader = new FileReader("setings.txt");
//
//             int c;
//             while ((c = fileReader.read()) != -1){
//                 System.out.print((char)c);
//             }
//             fileReader.close();
//         }
//         catch (IOException ex){
//            ex.printStackTrace();
//         }
//
//    }
//    People people = new People(null, 12);
}
