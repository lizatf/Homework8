package animals;

import java.util.Random;
import java.util.Scanner;

public class QA_27_8_9_3_Tuflina {
    public static void main(String[] args){
            Cat cats = new Cat(1, "Cat Boris", 9);
            Crow crows = new Crow(1, "Black Raven", "Black");
            Dog dogs = new Dog(1, "Dog Muhtar", 5);
            Fish fish = new Fish(1, "Fish Dora", "Salmon");
            Rabbit rabbits = new Rabbit(1, "Rabbit Snow", "white");
            Tiger tigers = new Tiger(1, "Tiger Rik", "caspian");

            Scanner scanner;
            int size = 0;
            do {
                scanner = new Scanner(System.in);
                System.out.print("Введите размер массива: ");
                try {
                    size = scanner.nextInt();
                } catch (Exception e){
                    System.out.println("Incorrect choise! You should try again! ");
                    continue;
                }
                if (size <= 0) {
                    System.out.println("Incorrect size of array!");
                }
            } while (size < 0);
            String[] animalsArray = {"Cat ", "Raven ", "Dog ", "Fish ", "Rabbit ", "Tiger "};
            String[] animals = new String[size];

            Random random = new Random();
            for (int i = 0; i < size; i++) {
                int randomAnimal = random.nextInt(animalsArray.length);
                animals[i] = animalsArray[randomAnimal];
            }
            for (int i = animals.length - 1; i > 0; i--) {
                int index = random.nextInt(i + 1);
                String temp = animals[i];
                animals[i] = animals[index];
                animals[index] = temp;
            }
            System.out.print("Массив животных: ");
            for (String animal : animals) {
                System.out.print(animal + " ");
            }

        System.out.println("\n");
            UserAction userAction;
        var actions = UserAction.values();
        while (true) {
            scanner = new Scanner(System.in);
            System.out.println("Select a point to:");
                for (int i = 0; i < actions.length; i++) {
                    System.out.println(actions[i].getCode() + actions[i].getDiscription());
                }
                try {
                    int enterNumber = scanner.nextInt();
                    userAction = UserAction.valueOf(enterNumber);
                } catch (Exception e){
                    System.out.println("Incorrect input, try again!");
                    continue;
                }
                if (userAction == null) {
                    System.out.println("Your choise is incorrect! Try again!");
                    continue;
                } else if (userAction == UserAction.EXIT) {
                    System.out.println("Goodbye!");
                    break;
                }
            switch (userAction) {
                case FEED: {
                        cats.eat("meat");
                        crows.eat("meat");
                        dogs.eat("chicken");
                        fish.eat("fry");
                        rabbits.eat("straw");
                        tigers.eat("meat");
                        break;

                    }
                case SAY: {
                        cats.say("Meow");
                        crows.say("Carr");
                        dogs.say("Bark");
                        tigers.say("Rrrr");
                        break;
                    }
                case FLY:
                        crows.fly();
                        break;
                case WALK:
                        dogs.walk();
                        break;
                case SWIM:
                        fish.swim();
                        break;
                case PLAY: {
                        cats.play();
                        dogs.play();
                        rabbits.play();
                        break;
                    }
                case HUNT: {
                        cats.hunt();
                        tigers.hunt();
                        break;
                    }
                }
            }
        }
}

