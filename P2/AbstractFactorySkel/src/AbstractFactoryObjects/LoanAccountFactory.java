package AbstractFactoryObjects;

import BankAccountTypes.Account;
import BankAccountTypes.LoanAccount;

public class LoanAccountFactory extends AbstractAccountFactory{

    @Override
    public Account getAccount(){
        return new LoanAccount(0, 0);
    }
}
