public class Account {

    double balance ;
    protected int accountNo ;
    protected String accountType ; // bunu enum yapmayı düşün
    
    // 2 consructor
    
    public Account(int accountNo, String accountType, double balance){
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.balance = balance;
    }
    
    public Account(int accountNo, String accountType) {
        this(accountNo,accountType,0)
    }
        
        
        
    public double withdrawMoney(double amount){
        if(amount > balance){
            throw new RuntimeException("Yetersiz bakiye");
        } else if (amount < 0){
            throw new RuntimeExcetion("Pozitif bir değer giriniz")
        }
        balance -= amount; // hesap bakiyesini amount kadar azaltır
        return amount; // çekilmek istenen miktarı döner, dönmese de olurdu
    }

    public double depositMoney(double amount){
        if (amount < 0){
            throw new RuntimeExcetion("Pozitif bir değer giriniz")
        }
        balance += amount;
        return balance; // güncel bakiyeyi döner
    }

    /*
    Bu metot kapatıldı çünkü şu anda zaten 1 account objesinin içindeyiz, objeyle konuşuyoruz. 
    tek 1 account objesi vermemiz yeterli olurdu. kendisiyle onun arasında havale gibi.
    
    ama bu işlemi burada değil account client da yapmak daha sağlıklı. orada yapılacak
    
    public void remit(Account account , Account account1){
            
    }
    */
}

