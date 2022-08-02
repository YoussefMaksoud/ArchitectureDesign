package MTQuestionSix;

import java.util.ArrayList;

public class MobileAppThreeSim extends NewsObserver {

    public MobileAppThreeSim(Handle h) {
        this.theHandle = h;
        this.subs = new ArrayList<Subscriber>();
        this.theHandle.addObs(this);
    }

    @Override
    public void update(){
        notifySubs("New Fox News");
    }
}
