package dogprogram;

public class Dog {

    //Instance Variables
    String name;
    String colourOfCoat;
    String breed;
    String size;
    String ownerName;
    String foodType;
    char gender;
    int noOfLegs;
    int age;
    double weight;
    double height;
    double distanceWalked;
    boolean trained;
    boolean isHungry;
    boolean teethDirty;
    boolean isHappy;

    //Methods
    public void bark() {
        System.out.println("Woof Woof");
    }

    public void displayDeatils() {
        System.out.println("Deatails for " + name);
        System.out.println("----------------------------");
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Coat Colour: " + colourOfCoat);
        System.out.println("Breed: " + breed);
        System.out.println("Size: " + size);
    }

    public void walkTheDog(double distanceWalked) {
        isHappy = true;
        isHungry = true;
        System.out.println(name + " is happy");
    }

    public void patTheDog() {
        isHappy = true;
        System.out.println("Dog is happy because it has been pated");
    }

    public void cleanTheTeeth() {
        teethDirty = true;
        isHappy = false;
        System.out.println("Dog's teeth is dirty");
    }

    public void feedTheDog() {
        teethDirty = false;
        isHungry = false;
        System.out.println("Plase feed the dog");

    }

}
