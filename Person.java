public class Person {
    private final int idCode;
    private final String firstName;
    private final String lastName;


    ////constructor goes here
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
    //no setters!
}
/**
 * Collection for holding Person objects.<br>
 * Provides the following guarantees:<br>
 * 1) Elements are guaranteed to be in ascending order, sorted by their ID code value.<br>
 * 2) Elements are guaranteed to have unique ID code values.<br>
 * <p>
 * Uses an underlying array for storing the elements. <br>
 * The object guarantees to not use more than twice the required array size.<br>
 * For example, if currently 10 persons are stored, then the underlying array size might range from 10 to 20, but will not be larger.
 */