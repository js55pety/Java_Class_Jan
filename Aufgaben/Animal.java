package animal;

abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public abstract String getSpecies();

    public abstract void speak();

    public String info() {
        return getName() + " is a " + getSpecies() + ".";
    }

    public static void main(String[] args) {
        Animal doggo = new Dog("Doggo", "brown");
        Animal donald = new Duck("Donald");
        Animal tickTock = new Crocodile("Tick-Tock");

        Animal[] animals = {doggo, donald, tickTock};
        for (Animal animal : animals) {
            Out.println(animal.info());
        }

        Out.println();

        for (Animal animal : animals) {
            animal.speak();
        }

        Out.println();

//        for (Animal animal : animals) {
//            if (Tier "animal" kann fliegen) {
//                rufe animal.fly() auf
//            }
//            if (Tier "animal" kann schwimmen) {
//                rufe animal.schwim() auf
//            }
//            if (Tier "animal" kann apportieren) {
//                rufe animal.fetch("ball") auf
//            }
//        }
    }
}