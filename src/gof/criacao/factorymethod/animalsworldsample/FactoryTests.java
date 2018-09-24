package gof.criacao.factorymethod.animalsworldsample;

public class FactoryTests {

    public static void main(String[] args) {

        AnimalFactory randomAnimalFactory = new RandomAnimalFactory();
        for (int qty = 0; qty < 10; qty++) {
            System.out.println(randomAnimalFactory.createAnimal().getName());
        }

        System.out.println("---------------------------");

        AnimalFactory balancedAnimalFactory = new BalancedAnimalFactory();
        for (int qty = 0; qty < 10; qty++) {
            System.out.println(balancedAnimalFactory.createAnimal().getName());
        }

    }

}
