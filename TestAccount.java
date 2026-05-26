public class TestAccount {

    public static void main(String[] args) 
    {
        
        // Two accounts
        Account acc1 = new Account("A101", "John", 5000);

        Account acc2 = new Account("A102", "Sarah", 4000);

        // original balances
        System.out.println("Before Transfer");

        System.out.println(acc1);
        System.out.println(acc2);

        // transfer money
        acc1.transferTo(acc2, 1000);

        // balances after transferring
        System.out.println();

        System.out.println("After Transfer");

        System.out.println(acc1);
        System.out.println(acc2);
    }
}





