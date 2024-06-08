package animals;

public class Tiger extends Animal implements HuntingAnimal {
    private String type;

    public Tiger(int id, String name, String type) {
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
        System.out.println(getName() + " says " +saySomething);
    }

    @Override
    public void eat(String nameOfFood) {
        System.out.println(getName() + " eats " +nameOfFood);
    }

    @Override
    public void hunt() {
        System.out.println(getName() +" is hunting");
    }
}
