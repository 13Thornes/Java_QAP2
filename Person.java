// Project: Java QAP2
// Author: Samantha Thorne
// Date: May 25-28 2024

public class Person {

    // initialize variables
    private String lastName;
    private String firstName;
    private Address home;

    // create constructor

    public Person(String ln, String fn, Address h) {
        this.lastName = ln;
        this.firstName = fn;
        this.home = h;
    }

    // accessor method
    public String toString () {
        return (this.firstName + " " + this.lastName + ", " + this.home);
    }
}
