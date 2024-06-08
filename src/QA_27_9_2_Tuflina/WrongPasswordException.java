package QA_27_9_2_Tuflina;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(){}
    public WrongPasswordException(String message){
        super(message);
    }
}
