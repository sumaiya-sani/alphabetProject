package Utils;

public class AnimalList {
    int animalImage;
    int animalName;
    int alphabetAnimalImage;

    public AnimalList(int animalImage, int animalName, int alphabetAnimalImage) {
        this.animalImage = animalImage;
        this.animalName = animalName;
        this.alphabetAnimalImage = alphabetAnimalImage;
    }
    public AnimalList(int animalImage, int animalName) {
        this.animalImage = animalImage;
        this.animalName = animalName;

    }

    public AnimalList() {

    }

    public int getAnimalImage() {
        return animalImage;
    }

    public void setAnimalImage(int animalImage) {
        this.animalImage = animalImage;
    }

    public int getAnimalName() {
        return animalName;
    }

    public void setAnimalName(int animalName) {
        this.animalName = animalName;
    }

    public int getAlphabetAnimalImage() {
        return alphabetAnimalImage;
    }

    public void setAlphabetAnimalImage(int alphabetAnimalImage) {
        this.alphabetAnimalImage = alphabetAnimalImage;
    }
}
