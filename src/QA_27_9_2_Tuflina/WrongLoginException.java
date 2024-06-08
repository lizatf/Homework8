package QA_27_9_2_Tuflina;

public class WrongLoginException extends Exception {
    public  WrongLoginException(){}

    public WrongLoginException (String message){
        super(message);
    }
}
