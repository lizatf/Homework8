package animals;

public class Dog extends Animal implements PlayingAnimal{

    private int hoursOfPlayOutside;

    public Dog(int id, String name, int hoursOfPlayOutside) {
        super(id, name);
        this.hoursOfPlayOutside = hoursOfPlayOutside;
    }

    public int getHoursOfPlayOutside() {
        return hoursOfPlayOutside;
    }

    public void setHoursOfPlayOutside(int hoursOfPlayOutside) {
        this.hoursOfPlayOutside = hoursOfPlayOutside;
    }

    @Override
    public void say(String saySomething) {
        System.out.println( getName() + " says " +saySomething);
    }

    @Override
    public void eat(String nameOfFood) {
        System.out.println(getName() + " eats " +nameOfFood);
    }

    public void walk(){
        System.out.println(getName() + " is walking");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing");
    }
}
