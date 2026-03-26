public class BankAccount {
    private String accountNo;
    private String holderName;
    private double balance;
    BankAccount()
    {
        this("PFHA-001");
    }
    BankAccount(String accountNo)
    {
        this(accountNo,"Hamna");
    }
    BankAccount(String accountNo,String holderName)
    {
        this(accountNo,holderName,0);
    }
    BankAccount(String accountNo,String holderName,double balance){
        setAccountNo(accountNo);
        setHolderName(holderName);
        setBalance(balance);
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    void deposit(double amount){
        if(amount>0){
            balance=amount;
            System.out.println(amount + "deposited. New balance is : "+ balance );}
        else {
            System.out.println("Invalid Amount Deposited!");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount >= balance){
            balance -= amount;
            System.out.println(amount + "withdraw.Remaining amount is: " + balance);}
        else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    void displayInfo() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    double calculateInterest() {
        return balance * 0.01;
    }

    public String toString() {
        return "AccountNo: " + accountNo + ", Name: " + holderName + ", Balance: " + balance;
    }
}


