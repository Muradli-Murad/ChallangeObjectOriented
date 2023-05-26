import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.logging.SocketHandler;

public class BankAccount extends Object {
    private String AccountNumber;
    private double AccountBalance;
    private String CustomerName;
    private String Email;
    private String PhoneNumber;

    public BankAccount(){
        this("55599",14,"Default name",
                "Default Email","Default phone");
        System.out.println("Empty constructor called ");
    }

    public BankAccount(String AccountNumber, double AccountBalance, String CustomerName,String Email, String PhoneNumber){
        System.out.println("Account constructor called with parameters ");
        this.AccountNumber=AccountNumber;
        this.AccountBalance=AccountBalance;
        this.CustomerName=CustomerName;
        this.Email=Email;
        this.PhoneNumber=PhoneNumber;
    }

    public BankAccount(String CustomerName,String Email, String  PhoneNumber ){
        this("55599",14,CustomerName,Email,PhoneNumber);
        System.out.println("Second constructor called ");
    }


    ///Getters

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    ///Setters

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public void setAccountBalance(double AccountBalance) {
        this.AccountBalance = AccountBalance;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /// Methods

    double deposit;
    double withdrow;

    public void depositingFunds(double deposit) {
        AccountBalance = AccountBalance + deposit;
        System.out.println(deposit + " $ added to the account. Your new balance is " + AccountBalance);
    }

    public void withdrowingFunds(double withdrow) {
        if (AccountBalance - withdrow < 0) {
            System.out.println("Insufficient funds. You only have $ " + AccountBalance + " $ in your account");
        } else {
            AccountBalance = AccountBalance - withdrow;
            System.out.println("Withdrawal of $ " + withdrow + " proceeded. Your remaining balance is " + AccountBalance);
        }
    }
}
