

class PremiumSavingsAccount extends SavingsAccount {

    private int rewardPoints;
    private double bonusRate;

    // Constructor
    PremiumSavingsAccount(String accountNo, String holderName, double balance,
                          double interestRate, double minBalance,
                          int rewardPoints, double bonusRate) {
        super(accountNo, holderName, balance, interestRate, minBalance); // parent constructor
        this.rewardPoints = rewardPoints;
        this.bonusRate = bonusRate;

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


    @Override
    void withdraw(double amount) {
        if(amount > 0 && getBalance() - getMinBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println(amount + " withdrawn. Remaining balance: " + getBalance());
        } else {
            System.out.println("Cannot withdraw. Minimum balance requirement not met");
        }
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Reward Points: " + rewardPoints);
        System.out.println("Bonus Rate: " + bonusRate + "%");
    }

    @Override
    double calculateInterest() {
        double interest = super.calculateInterest();
        double bonus = getBalance() * bonusRate / 100;
        return interest + bonus;
    }
}
