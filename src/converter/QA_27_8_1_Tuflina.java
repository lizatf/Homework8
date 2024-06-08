package converter;


import java.util.Scanner;

public class QA_27_8_1_Tuflina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение температуры: ");
        double temperature = scanner.nextDouble();

        CelsiusConverter celsiusConverter = new CelsiusConverter();
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        KelvinConverter kelvinConverter = new KelvinConverter();

        System.out.println(celsiusConverter.getDegreesType(temperature));
        System.out.println(kelvinConverter.getDegreesType(temperature));
        System.out.println(fahrenheitConverter.getDegreesType(temperature));



    }
}
