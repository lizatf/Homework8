package animals;

public enum UserAction {
    FEED(1," to feed animals"),
    SAY(2," to say something by animals"),
    FLY(3," to fly by animals"),
    WALK(4," to walk by animals"),
    SWIM(5," to swim by animals"),
    PLAY(6," to play by animals"),
    HUNT(7," to hunt by animals"),
    EXIT(8," to EXIT");

    private int code;
    private String discription;

    UserAction(int code, String description){
        this.code = code;
        this.discription= description;
    }

    public int getCode() {
        return code;
    }

    public String getDiscription() {
        return discription;
    }
    public static UserAction valueOf(int code) throws UserChoiseException{
        UserAction values[] = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].code == code)
                return values[i];
        }
        throw new UserChoiseException("Choise is incorrect!");
    }
}
