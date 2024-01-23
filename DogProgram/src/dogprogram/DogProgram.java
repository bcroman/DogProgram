package dogprogram;

public class DogProgram {

    public static void main(String[] args) {
        Dog theDog = new Dog();

        theDog.name = "Max";
        theDog.gender = 'M';
        theDog.age = 5;

        theDog.displayDeatils();
        theDog.bark();
        
        theDog.walkTheDog(0);
        theDog.patTheDog();
        theDog.cleanTheTeeth();
        theDog.feedTheDog();

    }

}
