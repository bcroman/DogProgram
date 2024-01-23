package dogprogram;

public class DogProgram {

    public static void main(String[] args) {
        Dog theDog = new Dog();
        Dog otherDog = new Dog();

        theDog.name = "Max";
        theDog.gender = 'M';
        theDog.age = 5;
        
        otherDog.name = "Milo";
        otherDog.gender = 'M';
        otherDog.age = 3;

        System.out.println("Deatails for " + theDog.name);
        System.out.println("----------------------------");
        System.out.println("Gender: " + theDog.gender);
        System.out.println("Age: " + theDog.age);
        
        System.out.println("Deatails for " + otherDog.name);
        System.out.println("----------------------------");
        System.out.println("Gender: " + otherDog.gender);
        System.out.println("Age: " + otherDog.age);
    }

}
