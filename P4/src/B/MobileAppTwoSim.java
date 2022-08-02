package MTQuestionSix;

import java.util.ArrayList;

public class MobileAppTwoSim extends NewsObserver {

    public MobileAppTwoSim(Handle h) {
        this.theHandle = h;
        this.subs = new ArrayList<Subscriber>();
        this.theHandle.addObs(this);
    }

    @Override
    public void update(){
        notifySubs("New CBC News");
    }
}
