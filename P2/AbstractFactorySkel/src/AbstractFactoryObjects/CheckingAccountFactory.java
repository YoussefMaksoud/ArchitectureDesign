package AbstractFactoryObjects;

import BankAccountTypes.Account;
import BankAccountTypes.CheckingAccount;

public class CheckingAccountFactory extends AbstractAccountFactory{

    @Override
    public Account getAccount(){
        return new CheckingAccount(0, 0);
    }
}
