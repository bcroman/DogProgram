package dogprogram;

public class Dog {

    //Instance Variables
    private String name;
    private String colourOfCoat;
    private String breed;
    private String size;
    private String ownerName;
    private String foodType;
    private char gender;
    private int noOfLegs;
    private int age;
    private double weight;
    private double height;
    private double distanceWalked;
    private boolean trained;
    private boolean isHungry;
    private boolean teethDirty;
    private boolean isHappy;

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

    //Getters & Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColourOfCoat() {
        return colourOfCoat;
    }

    public void setColourOfCoat(String colourOfCoat) {
        this.colourOfCoat = colourOfCoat;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
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
