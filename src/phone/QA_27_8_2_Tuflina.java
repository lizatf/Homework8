package phone;

public class QA_27_8_2_Tuflina {
    public static void main(String[] args) {
        Phone1 phone1 = new Phone1("+375 44 256 18 74","Xiaomi",200);
        Phone2 phone2 = new Phone2("+375 29 665 85 74", "Apple",172);
        Phone3 phone3 = new Phone3("+375 29 123 356 98","Samsung",195.2);
        System.out.println();

        phone1.printInformation();
        phone2.printInformation();
        phone3.printInformation();
        System.out.println();

        System.out.println(phone1.receiveCall("Саша"));
        System.out.println(phone2.receiveCall("Маша"));
        System.out.println(phone3.receiveCall("Катя"));
        System.out.println();

        phone1.receiveCall("Олег","+375 29 588 19 80");
        phone2.receiveCall("Влад","+375 44 899 96 54");
        phone3.receiveCall("Паша","+375 44 999 44 55");
        System.out.println();

        phone1.sendMessage("+375 29 588 19 80");
        phone2.sendMessage("+375 44 999 44 55");
        phone3.sendMessage("+375 44 899 96 54");


    }
}
