package animals;

public class Crow extends Animal {
    private String colorOfFeathers;

    public Crow(int id, String name, String colorOfFeathers) {
        super(id, name);
        this.colorOfFeathers = colorOfFeathers;
    }

    public String getColorOfFeathers() {
        return colorOfFeathers;
    }

    public void setColorOfFeathers(String colorOfFeathers) {
        this.colorOfFeathers = colorOfFeathers;
    }

    @Override
    public void say(String saySomething) {
        System.out.println(getName() + " says " +saySomething);
    }

    @Override
    public void eat(String nameOfFood) {
        System.out.println(getName() + " eats " +nameOfFood);
    }
    public void fly(){
        System.out.println(getName() + " is flying");
    }
}
