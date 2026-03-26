class SavingsAccount extends BankAccount {

    private double interestRate;
    private double minBalance;

    SavingsAccount(String accountNo, String holderName, double balance, double interestRate, double minBalance) {
        super(accountNo, holderName, balance); 
        this.interestRate = interestRate;
        this.minBalance = minBalance;

    }
    @Override
    void deposit(double amount) {
        if(amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println(amount + " deposited. New balance: " + getBalance());
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    @Override
    void withdraw(double amount) {
        if(amount > 0 && getBalance() - minBalance >= amount) {
            setBalance(getBalance() - amount);
            System.out.println(amount + " withdrawn. Remaining balance: " + getBalance());
        } else {
            System.out.println("Cannot withdraw. Minimum balance requirement not met");
        }
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Minimum Balance: " + minBalance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

