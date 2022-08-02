package BankAccountTypes;

public class LoanAccount extends Account{

    public LoanAccount(double currentBal, double unpayed){
        super(currentBal, unpayed, "Loan");
    }
}
