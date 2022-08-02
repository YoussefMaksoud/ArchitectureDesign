package BankAccountTypes;

import Views.AccountView;

public class LoanAccount extends Account {

    public LoanAccount(double currentBal, double unpayed){
        super(currentBal, unpayed, "Loan");
    }

    @Override
    public void displayAccountView() {
        System.out.println("loan Account View");
    }
}
