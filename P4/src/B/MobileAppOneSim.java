package MTQuestionSix;

import java.util.ArrayList;

public class MobileAppOneSim extends NewsObserver {

    public MobileAppOneSim(Handle h) {
        this.theHandle = h;
        this.subs = new ArrayList<Subscriber>();
        this.theHandle.addObs(this);
    }

    @Override
    public void update(){
        notifySubs("New BBC News");
    }
}
