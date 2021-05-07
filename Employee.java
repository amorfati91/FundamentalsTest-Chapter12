import java.time.LocalDate;
import java.util.Arrays;

public class Employee {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private BankAccount[] bankAccounts = new BankAccount[20];
    private double empAdvantageRate;

    public Employee(){
    }

    public Employee(String firstName, String lastName, BankAccount[] bankAccounts, double
                     empAdvantageRate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankAccounts = new BankAccount[]{};
        this.empAdvantageRate = empAdvantageRate;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", bankAccounts=" + Arrays.toString(bankAccounts) +
                ", empAdvantageRate=" + empAdvantageRate +
                '}';
    }
}
