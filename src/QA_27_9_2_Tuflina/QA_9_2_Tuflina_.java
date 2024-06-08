package QA_27_9_2_Tuflina;

import java.util.Scanner;

public class QA_9_2_Tuflina_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Information information = new Information();
        try {
            System.out.println("Введите логин: ");
            String login = scanner.next();
            System.out.println("Введите пароль: ");
            String password = scanner.next();
            System.out.println("Подтвердите пароль: ");
            String confirm = scanner.next();
            Information.verifyException(login,password,confirm);
        } catch (WrongLoginException e){
            System.out.println("Your login is incorrect!");
        } catch (WrongPasswordException e){
            System.out.println("Your password contains wrong symbols!");
        }

    }
}
