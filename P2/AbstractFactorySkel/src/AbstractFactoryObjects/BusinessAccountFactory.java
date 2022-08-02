package AbstractFactoryObjects;

import BankAccountTypes.Account;
import BankAccountTypes.BusinessAccount;

public class BusinessAccountFactory extends AbstractAccountFactory{

    @Override
    public Account getAccount(){
        return new BusinessAccount(0, 0);
    }
}
