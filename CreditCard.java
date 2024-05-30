// Project: Java QAP2
// Author: Samantha Thorne
// Date: May 25-28 2024

public class CreditCard {
    
    // initialize variables 
    private Money balance = new Money(0.00);
    private Money creditLimit;

    private Person owner;


    // constructor 
    public CreditCard(Person cardholder, Money limit) {
        
        this.owner = cardholder;
        this.creditLimit = limit;
        
        
        
    }

    // Accessor methods
    public Money getBalance() {

        return this.balance;
    }

    public void setBalance(Money amount) {
        this.balance.dollars = amount.dollars;
        this.balance.cents = amount.cents;
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public void setCreditLimit(Money amount) {
        this.creditLimit.dollars = amount.dollars;
        this.creditLimit.cents = amount.cents;
    }
    
    public String getPersonals() {
        return this.owner.toString();
    }


    // Charge money to card
    public void charge(Money amount) {
        double creditLimitTotCents = (this.creditLimit.dollars * 100) + this.creditLimit.cents;
        double amountTotCents = (amount.dollars * 100) + amount.cents; 
        double balanceTotCents = (this.getBalance().dollars* 100) + this.getBalance().cents;
        if (balanceTotCents + amountTotCents > creditLimitTotCents) {
            System.err.println("Amount exceeds credit limit");
        } else {
        this.getBalance().add(amount);
        this.getBalance();
        }
    }

    // Make payment towards card
    public void payment(Money amount) {
        this.getBalance().subtract(amount);
    }
}

