package AbstractFactoryObjects;

public class AccountRetriever {

    public static AbstractAccountFactory getFactory(String type){
        if(type == "Business"){
            return new BusinessAccountFactory();
        }
        else if(type == "Loan"){
            return new LoanAccountFactory();
        }
        else if(type == "Saving"){
            return new SavingAccountFactory();
        }
        else if(type == "Checking"){
            return new CheckingAccountFactory();
        }
        else {
            return new CheckingAccountFactory();
        }
    }
}
