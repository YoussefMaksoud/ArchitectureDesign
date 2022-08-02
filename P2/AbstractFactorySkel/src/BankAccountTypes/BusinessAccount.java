package BankAccountTypes;

import Views.AccountView;

public class BusinessAccount extends Account {

    public BusinessAccount(double currentBal, double unpayed){
        super(currentBal, unpayed, "Business");
    }

    @Override
    public void displayAccountView() {
        System.out.println("Business Account View");
    }
}
