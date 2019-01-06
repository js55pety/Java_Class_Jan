package person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return getFirstName() + " " + getLastName();
    }

    public int getAge() {
        return age;
    }

    public String getDetailedInformation() {
        return "Name: " + getName() + ", " + "Age: " + getAge();
    }

    public static void main(String[] args) {
        Person alice = new Person("Alice", "Wonder", 23);
        Person bob = new Professor("Bob", "Builder", 42);
//        Person claire = new Student("Claire", "Clear", 22, 987654321);

        System.out.println(alice.getDetailedInformation());
        System.out.println();
        System.out.println(bob.getDetailedInformation());
//        System.out.println();
//        System.out.println(claire.getDetailedInformation());
    }
}