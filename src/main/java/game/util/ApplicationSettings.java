package game.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ApplicationSettings {
    private HashMap<String, String> settings;
    private String fileToString(){
        String str = "";
        try {
            FileReader fileReader = new FileReader("setings.txt");

            int c;
            while ((c = fileReader.read()) != -1){
               str += (char)c;
            }
            fileReader.close();
        }
        catch (
                IOException ex){
            ex.printStackTrace();
        }
        return str;
    }

    public void loadSettings(){
        String text = fileToString();
        String [] lines = text.split("\n");

        HashMap<String, String> settings = new HashMap<>();

        for (String line : lines) {
            String[] setting = line.split(":");
            String key = setting[0];
            String value = setting[1];

            settings.put(key, value);
        }
        this.settings = settings;
    }

    public String getStringSetting(String settingName){
        return settings.get(settingName);
    }
    public int getIntegerSetting(String settingName){
        String value = getStringSetting(settingName);
        return Integer.parseInt(value);
    }
}
