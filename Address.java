// Project: Java QAP2
// Author: Samantha Thorne
// Date: May 25-28 2024

public class Address {

    // Initialize variables
    private String street;
    private String city;
    private String state;
    private String zip;

    // Create constructor
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    // Create accessor method
    public String toString() {
        return(this.street + ", " + this.city + ", " + this.state + ", " + this.zip);
    }
    
}
