package animals;

public class Fish extends Animal{
    private String type;

    public Fish(int id, String name, String type) {
        super(id, name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void say(String saySomething) {
    }

    @Override
    public void eat(String nameOfFood) {
        System.out.println(getName() + " eats " +nameOfFood);
    }
    public void swim() {
        System.out.println(getName() + " swims");
    }
}
