import java.util.Scanner;

public class Assignment16 {

    // ---------- User-defined (custom) exception class ----------
    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    // ---------- Another custom exception for invalid input ----------
    static class InvalidAmountException extends Exception {
        public InvalidAmountException(String message) {
            super(message);
        }
    }

    // Simple class representing a bank account, to give the custom exceptions a real use case
    static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public double getBalance() {
            return balance;
        }

        // Withdraw method that throws our custom exception when balance is insufficient
        public void withdraw(double amount) throws InsufficientBalanceException, InvalidAmountException {
            if (amount <= 0) {
                throw new InvalidAmountException("Withdrawal amount must be positive. You entered: " + amount);
            }
            if (amount > balance) {
                throw new InsufficientBalanceException(
                        "Insufficient balance! Available: " + balance + ", Requested: " + amount);
            }
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }

        public void deposit(double amount) throws InvalidAmountException {
            if (amount <= 0) {
                throw new InvalidAmountException("Deposit amount must be positive. You entered: " + amount);
            }
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(1000.0); // starting balance
        System.out.println("Initial balance: " + account.getBalance());

        // ---------- Deposit ----------
        try {
            System.out.print("\nEnter amount to deposit: ");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);
        } catch (InvalidAmountException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }

        // ---------- Withdraw ----------
        try {
            System.out.print("\nEnter amount to withdraw: ");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);
        } catch (InsufficientBalanceException | InvalidAmountException e) {
            // Multi-catch: catches either custom exception type in one block
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction attempt finished.");
        }

        System.out.println("\nFinal balance: " + account.getBalance());

        sc.close();
        System.out.println("\nProgram completed successfully.");
    }
}
