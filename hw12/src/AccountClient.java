public class AccountClient extends Account {

    
    /*
    bu istemcide biz account ile ilgili  gerekli servisi hizmeti sağlayacağız 
    
    o yüzden clientName gibi field'lara ihtiyacımız yok bu class durumsuz stateles bir servis hizmet sınıfı gibi çalışacak.
    
    String clientName;
    String clientSurname;
    int clientNo;

    public AccountClient(String clientName, String clientSurname, int clientNo) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientNo = clientNo;
    }
    */
    
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
    
    
    public double withrawMoney(Account account,double amount) {
        account.withrawMoney(amount);
    }
    
    public double depositMoney(Account account, double amount){
        account.depositMoney(amount);
    }
    
    

    
}


