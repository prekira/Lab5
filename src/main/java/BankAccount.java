import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        Bank.totalAccounts++;
        this.ownerName = name;
        this.accountType = accountCategory;
    }
    public void setAccountBalance(double balance) {
        this.accountBalance = balance;
    }
    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }
    public void setInterestEarned(double balance) {
        this.accountBalance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(BankAccountType accountType) {
        this.accountType = accountType;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public BankAccountType getAccountType() {
        return accountType;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public double getInterestEarned() {
        return interestEarned;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
