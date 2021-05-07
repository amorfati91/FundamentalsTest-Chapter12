public class BankAccount {

    private int accountNumber;
    private BankAccountType accountType;
    private String description;
    private double balance;

    public BankAccount(){
    }

    public BankAccount(int accountNumber, BankAccountType accountType, String description, double balance){
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.description = description;
        this.balance = balance;
    }

    protected double getBalance() {
        return balance;
    }
    protected double setBalance(double newBalance){
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountType=" + accountType +
                ", description='" + description + '\'' +
                ", balance=" + balance +
                '}';
    }
}
