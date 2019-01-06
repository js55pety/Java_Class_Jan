package animal;

public class Dog extends Animal {
    private String color;

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public String getSpecies() {
        // TODO
        return null;
    }

    @Override
    public void speak() {
        // TODO
    }
}
