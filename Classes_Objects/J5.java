class BankAccount {

    private long accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("Amount " + depositAmount + " Credited in your bank account");
        currentBalance();
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > balance) {
            System.out.println("Insuffient Balance Cannot proceed further");
        } 
        else {
            balance -= withdrawAmount;
            System.out.println("Amount " + withdrawAmount + " debited from your account");
        }
        currentBalance();
    }

    public void currentBalance() {
        System.out.println("CURRENT BALANCE: " + balance);
    }

    public void checkBalance() {
        currentBalance();    
    }   
}

public class J5 {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount(5238274949l, "Ramakant Shetty", 1545315.56);
        ba.deposit(15000);
        ba.withdraw(1600000);

    }
}
