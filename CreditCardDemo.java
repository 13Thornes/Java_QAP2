// Project: Java QAP2
// Author: Samantha Thorne
// Date: May 25-28 2024

public class CreditCardDemo {
    public static void main(String[] args) {

        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);
        Person owner = new Person("Christie", "Diane",
        new Address("237J Harvey Hall","Menomonie",
        "WI" , "54751"));
        CreditCard visa = new CreditCard(owner, LIMIT);
        System.out.println(visa.getBalance());
        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance().toString());
        System.out.println("Credit Limit : " + visa.getCreditLimit().toString());
        System.out.println();
        System.out.println("Attempt to charge " + FIRST_AMOUNT);

        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance : " + visa.getBalance());
        System.out.println("Attempt to charge " + SECOND_AMOUNT.toString());
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance : " + visa.getBalance().toString());
        System.out.println("Attempt to pay " + THIRD_AMOUNT.toString());
        visa.payment(THIRD_AMOUNT);
        System.out.println("Balance : " + visa.getBalance().toString());
        System.out.println("Attempt to charge " + FOURTH_AMOUNT.toString());
        visa.charge(FOURTH_AMOUNT);
        System.out.println("Balance : " + visa.getBalance().toString());
    }
    
}
