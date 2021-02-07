package Homework5;

public class Main {

    public static void main(String[] args) {

       animalOwner animalOwner = new animalOwner();
       animalOwner.setOwnerName(animalOwner.ownerName);
        Cat cat = new Cat();
        cat.setCatName("Ketty");
        cat.setBodyColor("orange");


        System.out.println("The name of this cat is " + cat.catName + " and the color of the body is " + cat.bodyColor +".");
        System.out.println("The owner of this cat is " + animalOwner.ownerName + ".");
    }
}
