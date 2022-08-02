package SingletonObjects;

import BankAccountTypes.*;

public class LoginObject {

    private static LoginObject theInstance = new LoginObject();

    private LoginObject(){}
    public static LoginObject getLoginObject(){
        return theInstance;
    }
    public Account getTheAccountAssociatedWithLogin(String username, String password, String type){
        Account dummy;
        if(type == "Checking"){
            dummy = new CheckingAccount(0, 0);
        }else if(type == "Business"){
            dummy = new BusinessAccount(0, 0);
        }else if(type == "Loan"){
            dummy = new LoanAccount(0, 0);
        }else if(type == "Saving"){
            dummy = new SavingAccount(0, 0);
        }else{
            dummy = new CheckingAccount(0, 0); // if unspecified, return checking account
        }
        return dummy;
    }
}
