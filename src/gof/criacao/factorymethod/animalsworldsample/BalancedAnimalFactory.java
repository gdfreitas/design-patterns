package gof.criacao.factorymethod.animalsworldsample;

import gof.criacao.factorymethod.animalsworldsample.animals.Cat;
import gof.criacao.factorymethod.animalsworldsample.animals.Dog;
import gof.criacao.factorymethod.animalsworldsample.animals.Duck;

public class BalancedAnimalFactory implements AnimalFactory {

    // DO NOT TRY THIS AT HOME: hardcoded way to memorize how many of each has in a "World" concept
    private int quantityOfCats = 0;
    private int quantityOfDogs = 0;
    private int quantityOfDucks = 0;

    @Override
    public Animal createAnimal() {
        if (quantityOfCats == quantityOfDogs) {
            quantityOfCats++;
            return new Cat("Felino");
        } else if (quantityOfDogs == quantityOfDucks) {
            quantityOfDogs++;
            return new Dog("Doggy");
        } else {
            quantityOfDucks++;
            return new Duck("Quack!");
        }
    }

}