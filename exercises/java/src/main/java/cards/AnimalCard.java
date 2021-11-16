package cards;

public class AnimalCard implements Card{

    private final Animal animal;

    AnimalCard(Animal animal) {
        this.animal = animal;
    }

    public Boolean snap( Card otherCard )
    { AnimalCard cardAnimal = (AnimalCard) otherCard;
        return cardAnimal != null && this.animal.equals(cardAnimal.animal);
    }

    @Override
    public String toString() {
        return animal.toString();
    }
}
