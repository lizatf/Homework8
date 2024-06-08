package animals;

public class Rabbit extends Animal implements PlayingAnimal{
    private String colorOfRabbit;

    public Rabbit(int id, String name, String colorOfRabbit) {
        super(id, name);
        this.colorOfRabbit = colorOfRabbit;
    }

    public String getColorOfRabbit() {
        return colorOfRabbit;
    }

    public void setColorOfRabbit(String colorOfRabbit) {
        this.colorOfRabbit = colorOfRabbit;
    }

    @Override
    public void say(String saySomething) {
    }

    @Override
    public void eat(String nameOfFood) {
        System.out.println(getName() +" eats " +nameOfFood);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing");
    }
}
