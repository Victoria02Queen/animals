package game;

public abstract class Eatable extends Item{
     private int healthLevel;

     public Eatable(Coordinates coordinates, int healthLevel){
          super(coordinates);
          this.healthLevel = healthLevel;
     }
     public int getHealthLevel() {
          return healthLevel;
     }
     public void setHealthLevel(int healthLevel) {

          this.healthLevel = healthLevel;
     }
     public abstract int getFoodLevelIncreasing();

     public void kill(){
          healthLevel = 0;
     }



}
