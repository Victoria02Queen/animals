package garbage;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit(2,"Nic");
        People people = new People(2,"ilia");

        Jumpable[] jumpables = {rabbit,people};

        for (Jumpable jumpable : jumpables){
            jumpable.jump();
        }
    }
}
