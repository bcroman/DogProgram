package dogprogram;

public class DogProgram {

    public static void main(String[] args) {
        Dog theDog = new Dog();
        Dog otherDog = new Dog("Brown","Boxer","Small",'f',4,10,10);

        theDog.setName("Max");
        theDog.setGender('M');
        theDog.setAge(5);

        theDog.displayDeatils();
        theDog.bark();

        theDog.walkTheDog(12);
        theDog.patTheDog();
        theDog.cleanTheTeeth();
        theDog.feedTheDog();
        
        otherDog.displayDeatils();

    }

}
