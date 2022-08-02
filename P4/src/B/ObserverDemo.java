package MTQuestionSix;

public class ObserverDemo {

    public static void main(String args[]){
        Handle theNewsHandle = new Handle(); //simulates the handle recieving news updates

        MobileAppOneSim bbcApp = new MobileAppOneSim(theNewsHandle); //creates bbc app and adds it to the handles observer list
        MobileAppTwoSim cbcApp = new MobileAppTwoSim(theNewsHandle);  //creates cbc app and adds it to the handles observer list
        MobileAppThreeSim foxApp = new MobileAppThreeSim(theNewsHandle); //creates fox app and adds it to the handles observer list

        //bbc subs
        Subscriber John = new Subscriber("John");
        Subscriber Natalie = new Subscriber("Natalie");
        theNewsHandle.addSub(John, "bbc");
        theNewsHandle.addSub(Natalie, "bbc");

        //cbc subs
        Subscriber Callum = new Subscriber("Callum");
        Subscriber Anna = new Subscriber("Anna");
        theNewsHandle.addSub(Callum, "cbc");
        theNewsHandle.addSub(Anna, "cbc");

        //fox subs
        Subscriber Youssef = new Subscriber("Youssef");
        Subscriber Matt = new Subscriber("Matt");
        theNewsHandle.addSub(Youssef, "fox");
        theNewsHandle.addSub(Matt, "fox");

        //simulate bbc news update
        theNewsHandle.getBBCNews();
        //simulate cbc news update
        theNewsHandle.getCBCNews();
        //simulate fox news update
        theNewsHandle.getFoxNews();


    }
}
