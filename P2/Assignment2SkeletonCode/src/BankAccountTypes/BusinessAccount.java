package BankAccountTypes;

public class BusinessAccount extends Account{

    public BusinessAccount(double currentBal, double unpayed){
        super(currentBal, unpayed, "Business");
    }
}
