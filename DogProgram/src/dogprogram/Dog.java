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

    //Constructors
    Dog() {
        ownerName = "Unknown";
        foodType = "Beef";
        gender = ' ';
        noOfLegs = 4;
        weight = 0;
        height = 0;
        distanceWalked = 0;
        trained = false;
        isHungry = true;
        teethDirty = false;
        isHappy = true;
    }

    Dog(String colourOfCoat, String breed, String size, char gender, int noOfLegs, double weight, double height) {
        this.colourOfCoat = colourOfCoat;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.noOfLegs = noOfLegs;
        this.weight = weight;
        this.height = height;

        ownerName = "Unknown";
        foodType = "Beef";
        distanceWalked = 0;
        trained = false;
        isHungry = true;
        teethDirty = false;
        isHappy = true;
        name = "Unknown";
    }

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
        System.out.println("Num of Legs: " + noOfLegs);
    }

    public void walkTheDog(double distanceWalked) {
        isHappy = true;
        isHungry = true;
        System.out.println(name + " walked " + distanceWalked);
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
