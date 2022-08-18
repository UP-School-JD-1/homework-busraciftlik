public class AccountClient {
    private double clientBalance;
    private static final double COMMISSION_RATE = 0.05;
    
    
    
    public boolean remit(Account creditor,Account borrower, double amount){
        if(creditor.getBalance() < amount) {
            System.out.println("Yetersiz bakiye");
            return false;
        }
        double commission = amount * COMMISSION_RATE;
        clientBalance += commission;
        
        double netAmount = amount - commission;
        
        creditor.withdrawMoney(amount);
        borrower.depositMoney(netAmount);
        return true;
    }
    
    
    public double withdrawMoney(Account account,double amount) {
       return account.withdrawMoney(amount);
    }
    
    public double depositMoney(Account account, double amount){
      return  account.depositMoney(amount);
    }
    
    

    
}


