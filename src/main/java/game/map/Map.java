package game.map;

import game.items.parent.Item;

public class Map {
    private final int height;
    private final int width;

    private final Item[][] map;

    public Map (int height, int width){
        this.height = height;
        this.width = width;
        this.map = new Item[height][width];
    }

    @Override
    public String toString() {
        String result = "";
        for (int y = 0; y < height; y++){
            for (int x = 0; x < width; x++){
                result += getShortName(map[y][x]) + " ";
            }
            result += "\n";
        }
        return result;
    }

    public String getShortName(Item item){
        if (item != null){
            String name = item.getClass().getSimpleName();
            return name.substring(0, 3);
        }
       return null;
    }

    public void setItem(Item item, Coordinates coordinates){

        map[coordinates.getY()][coordinates.getX()] = item;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Item[][] getMap() {
        return map;
    }

    public Item getItem(Coordinates coordinates){
        return map[coordinates.getY()][coordinates.getX()];
    }
}
