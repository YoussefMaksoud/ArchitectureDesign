package MTQuestionSix;

import java.util.ArrayList;

public abstract class NewsObserver {

    protected ArrayList<Subscriber> subs;

    protected Handle theHandle;

    public abstract void update();

    public void addSub(Subscriber s){
        subs.add(s);
    }

    public void removeSub(Subscriber s){
        subs.remove(s);
    }

    public void notifySubs(String news){
        for(int i = 0; i < subs.size(); i++){
            subs.get(i).displayNewsUpdate(news);
        }
    }

}
