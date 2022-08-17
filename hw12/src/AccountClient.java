public class AccountClient extends Account {

    String clientName;
    String clientSurname;
    int clientNo;

    public AccountClient(String clientName, String clientSurname, int clientNo) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientNo = clientNo;
    }

    public double getBalance() {
        return balance;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public int getClientNo() {
        return clientNo;
    }

    void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public void setClientNo(int clientNo) {
        this.clientNo = clientNo;
    }

    @Override
    public void depositMoney() {
        if (balance != 0) {
            System.out.println("money deposited");
        }
    }

    @Override
    public void withdrawMoney() {
        System.out.println("money was taken");
    }

    @Override
    public void remit(Account account , Account account1) {
        double remittanceFee ;
    }
}


