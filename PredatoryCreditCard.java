public class PredatoryCreditCard extends CreditCard {
    public double apr;

    public PredatoryCreditCard(String customer, String bank, String account, int limit, double balance, double rate){
        super(customer, bank, account, limit, balance);
        this.apr = rate;
    }
    
}
