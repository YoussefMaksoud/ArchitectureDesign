package UserTypes;

import AbstractFactoryObjects.AbstractAccountFactory;
import AbstractFactoryObjects.AccountRetriever;
import BankAccountTypes.*;

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

    public void login(String type /*username, password*/){

        AbstractAccountFactory accountFactory = AccountRetriever.getFactory(type);
        theAccount = accountFactory.getAccount();

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

        AbstractAccountFactory accountFactory = AccountRetriever.getFactory(type);

        if(theAccount != null){
            theAccount = null;
        }

        theAccount = accountFactory.getAccount();
    }
}
