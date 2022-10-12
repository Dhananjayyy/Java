public class PredatoryCreditCard extends CreditCard {
    public double apr;

    public PredatoryCreditCard(String customer, String bank, String account, int limit, double balance, double rate){
        super(customer, bank, account, limit, balance);
        this.apr = rate;
    }

    // New Method for monthly interest

    public void processMonth(){
        if(balance >0){
            double monthlyFactor = Math.pow(1+apr, 1.0/12);
            balance *= monthlyFactor;
        }
    }

    // Override Charge method

    public boolean recharge(double price){
        boolean isSuccess = super.recharge(price);
        if(!isSuccess){
            balance += 5;
        }
        return isSuccess;
    }
    
}
