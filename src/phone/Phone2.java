package phone;

public class Phone2 implements PrintInfo1 {
    private String number;
    private String model;
    private double weight;

    public Phone2(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone2(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone2() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void printInformation() {
        System.out.println("Телефон модели: " + getModel() + ", с номером телефона: " + getNumber() + " и весом: " + getWeight());
    }

    public String receiveCall(String name) {
        System.out.print("Звонит " + name + " ");
        return getNumber();
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номером телефона: " + number);
    }
    public int sendMessage(String... numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Сообщение будет отправлено на номер телефона: "+numbers[i]);
        }
        return 0;
    }
}
