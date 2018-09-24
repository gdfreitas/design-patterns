package gof.criacao.factorymethod.animalsworldsample;

import gof.criacao.factorymethod.animalsworldsample.animals.Cat;
import gof.criacao.factorymethod.animalsworldsample.animals.Dog;
import gof.criacao.factorymethod.animalsworldsample.animals.Duck;

public class RandomAnimalFactory implements AnimalFactory {

    @Override
    public Animal createAnimal() {
        double randomNumber = Math.random();
        if (randomNumber < 0.35) {
            return new Cat("Felino");
        } else if (randomNumber >= 0.35 && randomNumber <= 0.75) {
            return new Dog("Doggy");
        } else  {
            return new Duck("Quack!");
        }
    }

}