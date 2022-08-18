public class Account {

    
    // 3 de private yapıldı , dışarıdan kontrolsüz değiştirilmesi istenmiyor.
    private double balance ;  
    private int accountNo ;
    private String accountType ; // bunu enum yapmayı düşün
    
    // 2 consructor
    
    public Account(int accountNo, String accountType, double balance){
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.balance = balance;
    }
    
    public Account(int accountNo, String accountType) {
        this(accountNo,accountType,0);
    }
        
        
        
    public double withdrawMoney(double amount){
        if(amount > balance){
            throw new RuntimeException("Yetersiz bakiye");
        } else if (amount < 0){
            throw new RuntimeException("Pozitif bir değer giriniz");
        }
        balance -= amount; // hesap bakiyesini amount kadar azaltır
        return amount; // çekilmek istenen miktarı döner, dönmese de olurdu
    }

    public double depositMoney(double amount){
        if (amount < 0){
            throw new RuntimeException("Pozitif bir değer giriniz");
        }
        balance += amount;
        return balance; // güncel bakiyeyi döner
    }

    
    public double getBalance(){
        return this.balance;
    }
    
    public int getAccountNo(){
        return this.accountNo;
    }
    
    public String getAccountType(){
        return this.accountType;
    }
    
    
    /*
    Bu metot kapatıldı çünkü şu anda zaten 1 account objesinin içindeyiz, objeyle konuşuyoruz. 
    tek 1 account objesi vermemiz yeterli olurdu. kendisiyle onun arasında havale gibi.
    
    ama bu işlemi burada değil account client da yapmak daha sağlıklı. orada yapılacak
    
    public void remit(Account account , Account account1){
            
    }
    */
}

