// Project: Java QAP2
// Author: Samantha Thorne
// Date: May 25-28 2024

public class Money {

    // initialize variables 

    long dollars;
    long cents;

    // Create constructor
    public Money(double amount) {
        double totalCents = amount * 100;
        this.dollars = (long)Math.floor(totalCents / 100);
        this.cents = (long)totalCents % 100;
    }

    // create copy constructor

    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Can't figure out how to add a 0 in front of the 2 cents without changeing the return type
    public Money add(Money amount) {
        double origTotCents = (this.dollars * 100.00) + this.cents;
        double amountTotCents = (amount.dollars * 100.00) + amount.cents;
        double addedCents = origTotCents + amountTotCents;
        this.dollars = (long)Math.floor(addedCents / 100);
        this.cents = (long)addedCents % 100;
        this.cents = Math.round(this.cents * 100)/100;
        return amount;
            
    }

    public Money subtract(Money amount) {
        double origTotCents = (this.dollars * 100) + this.cents;
        double amountTotCents = (amount.dollars * 100) + amount.cents;
        double addedCents = origTotCents - amountTotCents;
        this.dollars = (long)Math.floor(addedCents / 100);
        this.cents = (long)addedCents % 100; 
        return(amount); 
    }

    // Compare amount to amount
    public int compareTo(Money amount) {
        long origTotCents = (this.dollars * 100) + this.cents;
        long amountTotCents = (amount.dollars * 100) + amount.cents;
        if (origTotCents == amountTotCents) {
            return 0;
        } else {
            if (origTotCents < amountTotCents) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    // Checks if money is equal to another amount
    public boolean equals(Money amount) {
        long origTotCents = (this.dollars * 100) + this.cents;
        long amountTotCents = (amount.dollars * 100) + amount.cents;
        if (origTotCents == amountTotCents) {
            return true;
        } else {
            return false;
        }
    }

    // toString() method
    public String toString() {
        if (this.cents < 10) {
            String moneyString = "$" + this.dollars + ".0" + this.cents;
            return moneyString;
        } else {
            String moneyString = "$" + this.dollars + "." + this.cents;
            return moneyString;
    }
} }
