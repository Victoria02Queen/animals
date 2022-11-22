package garbage;

public class People implements Runnable, Jumpable{
    int age;
    String name;

    public People(int age, String  name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("i running, i'm people");
    }
    @Override
    public void jump() {
        System.out.println("i'm jumping, i'm people");
    }
}
