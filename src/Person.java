import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Person {
    String firstName;
    String lastName;
    String contactNumber;
    String emailAddress;

    public Person(String firstName, String lastName, String contactNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.next = null;
    }

    Person next;
}
