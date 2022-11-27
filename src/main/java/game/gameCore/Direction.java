package game.gameCore;

public enum Direction {
    LEFT,
    RIGHT,
    UP,
    DOWN;

    public static Direction getRandom(){
        int direction = (int)(Math.random()*((3 - 0)+1)) + 0;
        return Direction.values()[direction];
    }
}
