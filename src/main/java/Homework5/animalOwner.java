package Homework5;

public class animalOwner {
    protected String ownerName;
    protected String ownerAddress;
    protected animalOwner animalOwner;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = "Billy";
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public Homework5.animalOwner getAnimalOwner() {
        return animalOwner;
    }

    public void setAnimalOwner(Homework5.animalOwner animalOwner) {
        this.animalOwner = animalOwner;
    }
}
