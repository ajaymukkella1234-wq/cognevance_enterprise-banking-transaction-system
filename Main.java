
// Main.java
public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.login();

        Account account = new Account();

        account.deposit(5000);

        Transaction transaction = new Transaction();
        transaction.transfer(2000);

        System.out.println("Current Balance: " + account.balance);
    }
}
