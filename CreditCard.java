// Project: Java QAP2
// Author: Samantha Thorne
// Date: May 25-28 2024

public class CreditCard {
    
    // initialize variables 
    private Money balance;
    private Money creditLimit;
    private Person owner;


    // constructor 
    public CreditCard(Person cardholder, Money limit, Money balance) {
        this.balance = new Money(balance);
        this.balance.dollars = 0;
        this.balance.cents = 0;
        this.owner = cardholder;
        this.creditLimit = limit;
        
        
        
    }

    // Accessor methods
    public Money getBalance() {
        return this.balance;
    }

    public Money getCreditLimit() {
        return this.creditLimit;
    }
    
    public String getPersonals() {
        return this.owner.toString();
    }


    // Charge money to card
    public void charge(Money amount) {
        double creditLimitTotCents = (this.creditLimit.dollars * 100) + this.creditLimit.cents;
        double amountTotCents = (amount.dollars * 100) + amount.cents; 
        double balanceTotCents = (this.balance.dollars * 100) + this.balance.cents;
        if (balanceTotCents + amountTotCents > creditLimitTotCents) {
            System.err.println("Amount exceeds credit limit");
        } else {
        this.balance.add(amount);
        }
    }

    // Make payment towards card
    public void payment(Money amount) {
        this.balance.subtract(amount);
    }
}
