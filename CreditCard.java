public class CreditCard {
    // Instance variables
    private String customer; // Customer Name
    private String bank; // Bank Name
    private String account; // Account Number (e.g., 4584 5688 5221 2365)
    private int limit; // Credit limit
    protected double balance; // Current balance

    // Constructors
    public CreditCard(String customer, String bank, String account, int limit, double balance){
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    // Main method
    public static void main(String[] args){
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("Dhananjay Yelwande", "Union Bank of India", "2199 8983 6373", 5000, 0.0);
        wallet[1] = new CreditCard("Dhananjay Yelwande", "State Bank of India", "2199 8983 6373", 10000, 0.0);
        wallet[2] = new CreditCard("Dhananjay Yelwande", "Central Bank of India", "2199 8983 6373", 15000, 0.0);
        
        // Let's recharge wallet[0]
        

        // Let's pay for a coffee
        wallet[0].pay(40);
        
        for (int i=0; i<wallet.length;i++){
            System.out.println("["+(i+1)+"]");
            wallet[i].recharge(3000);
            CreditCard.printSummary(wallet[i]);
            wallet[i].pay(230);
            System.out.println("After transaction:"+wallet[i].getBalance());
            System.out.println("--------------------");
        }
    }

    // Print card summary method
    public static void printSummary(CreditCard card){
        System.out.println("Name: "+card.customer);
        System.out.println("Bank: "+card.bank);
        System.out.println("Account: "+card.account);
        System.out.println("Limit: "+card.limit);
        System.out.println("Balance: "+card.balance);
    }

    // Getter methods

    public String getCustomer(){
        return customer;
    }

    public String getBank(){
        return bank;
    }

    public String getAccount(){
        return account;
    }

    public int getLimit(){
        return limit;
    }

    public double getBalance(){
        return balance;
    }

    // Setter methods

    // Recharge
    public boolean recharge(double price){
        if (price + balance > limit){
            return false;
        } 
        else {
            balance+= price;
            return true;
        }

    }

    // Payment
    public void pay(double amount){
        balance -= amount;
    }

    
}
