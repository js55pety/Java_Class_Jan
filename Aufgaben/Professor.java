package person;

public class Professor extends Person {

    @Override
    public String getName() {
        return "Prof." + " " + getFirstName() + " " + getLastName();
    }

}