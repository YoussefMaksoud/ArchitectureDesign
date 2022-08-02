package BankAccountTypes;

public class CheckingAccount extends Account{

    public CheckingAccount(double currentBal, double unpayed){
        super(currentBal, unpayed, "Checking");
    }
}
