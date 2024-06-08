package QA_27_9_2_Tuflina;

public class Information{
    private  String login;
    private  String password;
    private  String confirmPassword;

    public Information(){
    }


    public static boolean verifyException(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException();
        }
        if (password.length() > 20 || password.contains(" ") || password.contains("1") || !(password.equals(confirmPassword))){
throw new WrongPasswordException();
        } return true;

    }

}
