package dogprogram;

import java.util.Scanner;
import java.util.Set;

public class DogProgram {

    public static void main(String[] args) {

        Scanner kboard = new Scanner(System.in);

        //variables
        String name = "";
        String colour = "";
        String breed = "";
        int age = 0;
        int noOfLegs = 0;

        Dog theDog = new Dog();
        Dog otherDog = new Dog("Brown", "Boxer", "Small", 'f', 4, 10, 10);

        //input validation
        while (name.isEmpty()) {
            System.out.println("Enter dogs's name?");
            name = kboard.next();
        }

        while (colour.isEmpty()) {
            System.out.println("Enter dogs's coat colour?");
            colour = kboard.next();
        }

        while (breed.isEmpty()) {
            System.out.println("Enter dogs's breed?");
            breed = kboard.next();
        }

        while (age <= 0 || age > 15) {
            System.out.println("Enter dogs's age?");
            age = kboard.nextInt();
        }

        while (noOfLegs <= 0 || noOfLegs > 4) {
            System.out.println("Enter dogs's no of legs?");
            noOfLegs = kboard.nextInt();
        }

        //call setter functions
        theDog.setName(name);
        theDog.setColourOfCoat(colour);
        theDog.setBreed(breed);
        theDog.setAge(age);
        theDog.setNoOfLegs(noOfLegs);

        theDog.displayDeatils();
        theDog.bark();

        theDog.walkTheDog(12);
        theDog.patTheDog();
        theDog.cleanTheTeeth();
        theDog.feedTheDog();

        otherDog.displayDeatils();

    }

}
