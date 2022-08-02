package BankAccountTypes;

import Views.AccountView;

public class SavingAccount extends Account {

    public SavingAccount(double currentBal, double unpayed){
        super(currentBal, unpayed, "Saving");
    }

    @Override
    public void displayAccountView() {
        System.out.println("Saving Account View");
    }
}
