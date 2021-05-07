import java.time.Instant;
import java.time.LocalDate;

public class UserService {

    public int calcAge(User user){
        if (user.getBirthday() < 65){

            return calcAge();
        }
    }

    public boolean isSenior(User user){
        if (user.getBirthday() < 65) {
            return false;
        }
    }

    public boolean isMinor(User user){
        return true;
    }

    public String deposit(BankAccount account, double amount) {
        if (amount < 0) {
            return "Transaction Invalid";
        }
        account.setBalance(account.getBalance() + amount);
        return String.format("Amount %d Deposited", amount);
    }

    public String withdraw(BankAccount account, double amount) {
        if (amount < 0) {
            return "Transaction Invalid";
        }
        if (amount > account.getBalance()){
            return "Not Enough Funds";
        }
        account.setBalance(account.getBalance() - amount);
        return String.format("Amount %d Withdrawn Successfully", amount);
    }

    public String transfer(BankAccount source, BankAccount target, double amount){
        if (amount < 0) {
            return "Transaction Invalid";
        }
        if (amount > source.getBalance()){
            return "Insufficient Funds";
        }
        withdraw(source, amount);
        deposit(target, amount);
        return String.format("Amount %d Successfully Transferred", amount);



    }

}
