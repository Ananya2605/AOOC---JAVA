class BankAccount {
    double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }
    @Override
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Minimum balance must be 100.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}
public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(500);
        sa.deposit(200);
        sa.withdraw(550);
        sa.displayBalance();
    }
}