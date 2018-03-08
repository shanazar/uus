package SUPL;

public class Person {
    private final int idCode;
    private final String firstName;
    private final String lastName;

    //constructor goes here

    public Person(int idCode, String firstName, String lastName) {
        this.idCode = idCode;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters go here

    public int getIdCode() {
        return idCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idCode=" + idCode +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
//no setters!
}


