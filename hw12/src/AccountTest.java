public class AccountTest {
    public static void main(String[] args) {
        
        Account account1 = new Account(1,"Individual",100);
        Account account2 = new Account(2,"Individual",200);
        
        AccountClient client = new AccountClient();
        
        client.remit(account1,account2,20);
        
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
       

        
    }
}
