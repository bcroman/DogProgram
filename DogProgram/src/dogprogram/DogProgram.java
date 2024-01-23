package dogprogram;

public class DogProgram {

    public static void main(String[] args) {
        Dog theDog = new Dog();
        Dog otherDog = new Dog("Brown","Boxer","Small",'f',4,10,10);

        theDog.name = "Max";
        theDog.gender = 'M';
        theDog.age = 5;
        theDog.distanceWalked = 12;

        theDog.displayDeatils();
        theDog.bark();

        theDog.walkTheDog(theDog.distanceWalked);
        theDog.patTheDog();
        theDog.cleanTheTeeth();
        theDog.feedTheDog();
        
        otherDog.displayDeatils();

    }

}
