public class SavingAccount {
    int balance;

    public SavingAccount(int initialBalance) {
        balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Your Balance is " + balance);
    }

    public void deposit(int amountToDeposit) {
        int newBalance = balance + amountToDeposit;
        balance = newBalance;
        System.out.println("You just deposited " + amountToDeposit);
    }

    public int withdraw(int amountToWithdraw) {
        int newBalance = balance - amountToWithdraw;
        balance = newBalance;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }

    public static void main(String[] args) {
        SavingAccount savings = new SavingAccount(2000);

        System.out.println("You balance is " + savings.balance);

        // withdrawing
        int afterWithdraw = savings.balance - 300;
        savings.balance = afterWithdraw;
        System.out.println("You just withdrew " + 300);

        // deposit
        int afterDeposit = savings.balance + 600;
        savings.balance = afterDeposit;
        System.out.println("You just deposited " + 600);

        savings.checkBalance();

        savings.deposit(1000000);
        savings.withdraw(500);

        savings.checkBalance();
    }
}