import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class User {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private BankAccount[] bankAccounts = new BankAccount[10];

    public User() {
    }

    public User(String firstName, String lastName, LocalDate birthday, BankAccount[] bankAccounts) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.birthday = LocalDate.of(1991, Month.FEBRUARY, 26);
        this.bankAccounts = new BankAccount[]{};
    }

    protected String getFirstName(){
        return firstName;
    }

    protected String getLastName(){
        return  lastName;
    }
    protected LocalDate getBirthday(){
        return birthday;
    }
    protected BankAccount[] getBankAccounts(){
        return bankAccounts;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", bankAccounts=" + Arrays.toString(bankAccounts) +
                '}';
    }
}
