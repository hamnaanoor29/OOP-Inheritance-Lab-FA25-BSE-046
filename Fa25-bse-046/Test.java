public class Test {
    public static void main(String[] args) {

        System.out.println("---- SavingsAccount -----");
        SavingsAccount s = new SavingsAccount("SA001","Hamna",10000,5,2000);
        s.displayInfo();
        s.deposit(2000);
        s.withdraw(9000);
        System.out.println("Interest: " + s.calculateInterest());

        System.out.println("\n---- PremiumSavingsAccount ----");
        PremiumSavingsAccount p = new PremiumSavingsAccount("PSA001","Hamna",20000,6,5000,100,2);
        p.displayInfo();
        p.deposit(5000);
        p.withdraw(10000);
        System.out.println("Interest + Bonus: " + p.calculateInterest());
    }
}

