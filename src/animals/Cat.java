package animals;

public class Cat extends Animal implements PlayingAnimal,HuntingAnimal {

  private final int numberOfLives;

    public Cat(int id, String name, int numberOfLives) {
        super(id, name);
        this.numberOfLives = numberOfLives;

    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    @Override
    public void say(String saySomething) {
        System.out.println( getName() + " says " +saySomething);
    }

    @Override
    public void eat(String nameOfFood) {
        System.out.println(getName() + " eats " +nameOfFood);
    }

    @Override
    public void play() {
        System.out.println(getName() + "is playing");
    }

    @Override
    public void hunt() {
        System.out.println( getName() + " is hunt");
    }
}
