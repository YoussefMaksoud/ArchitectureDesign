package UserTypes;

import BankAccountTypes.*;
import SingletonObjects.LoginObject;

import java.util.List;

public class BankSystemUser extends User {

    private String userName;
    private String password;

    private String cardNum;
    private String billingAddress;
    private String emailAddress;

    private Account theAccount;

    public BankSystemUser(int id, String first, String last, String un, String pw,
                          String card, String address, String email){

        super(id, first, last);
        this.userName = un;
        this.password = pw;
        this.cardNum = card;
        this.billingAddress = address;
        this.emailAddress = email;

    }

    public void login(String type){

        LoginObject loginInstance = LoginObject.getLoginObject();
        theAccount = loginInstance.getTheAccountAssociatedWithLogin(userName, password, type);

    }

    public void viewBalance(){
        theAccount.getAccountBalance();
    }

    public void payBill(double amountPayed){
        theAccount.payUnPayedBalance(amountPayed);
    }

    public void registerAccount(String type){

    }

    public void switchAccounts(String type){
        if(theAccount != null){ //already logged in
            theAccount = null;
            LoginObject loginInstance = LoginObject.getLoginObject();
            theAccount = loginInstance.getTheAccountAssociatedWithLogin(userName, password, type);
        }
    }
}
