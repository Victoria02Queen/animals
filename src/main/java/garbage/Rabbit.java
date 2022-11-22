package garbage;

public class Rabbit implements Jumpable{
    int age;
    String name;

    public Rabbit(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("i'm jump");
    }


}
