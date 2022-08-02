package BankAccountTypes;

import UserTypes.User;
import Views.AccountView;

public abstract class Account implements AccountView {

    private double accountBalance;
    private double unPayedBalance;

    private String type;

    public Account(double ab, double upb, String t){
        this.accountBalance = ab;
        this.unPayedBalance = upb;
        this.type = t;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getUnPayedBalance() {
        return unPayedBalance;
    }

    public void payUnPayedBalance(double payAmount) {
        this.unPayedBalance = this.unPayedBalance - payAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
