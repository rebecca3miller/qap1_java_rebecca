public class Account {

    // Variables
    private String id;
    private String name;
    private int balance;

    // parameterized constructor
    public Account(String id, String name, int balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // getter methods
    public String getID()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public int getBalance()
    {
        return this.balance;
    }

    // credit method
    public int credit(int amount)
    {
        this.balance = this.balance + amount;

        return this.balance;
    }

    // Debit method
    public int debit(int amount)
    {
        if(amount <= this.balance)
        {
            this.balance = this.balance - amount;
        }

        else
        {
            System.out.println("Amount exceeded balance");
        }

        return this.balance;
    }

    // Transfer method 
    public int transferTo(Account another, int amount)
    {
        if(amount <= this.balance)
        {
            this.balance = this.balance - amount;

            another.balance = another.balance + amount;
        }

        else
        {
            System.out.println("Amount exceeded balance.");
        }

        return this.balance;
    }

    @Override
    public String toString()
    {
        return ("Account[id=" + this.id + ", name=" + this.name + ", balance=" + this.balance + "]");
    }
    
}