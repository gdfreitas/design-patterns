package gof.criacao.factorymethod.animalsworldsample;

public abstract class Animal {

    private String name;

    public Animal(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
