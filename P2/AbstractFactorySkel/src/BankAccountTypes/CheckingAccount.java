package BankAccountTypes;

import Views.AccountView;

public class CheckingAccount extends Account {

    public CheckingAccount(double currentBal, double unpayed){
        super(currentBal, unpayed, "Checking");
    }

    @Override
    public void displayAccountView() {
        System.out.println("Checking Account View");
    }
}
