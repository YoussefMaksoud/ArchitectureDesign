package AbstractFactoryObjects;

import BankAccountTypes.Account;
import BankAccountTypes.SavingAccount;

public class SavingAccountFactory extends AbstractAccountFactory{

    @Override
    public Account getAccount(){
        return new SavingAccount(0, 0);
    }
}
