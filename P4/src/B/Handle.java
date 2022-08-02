package MTQuestionSix;

import java.util.ArrayList;

public class Handle {

    private ArrayList<NewsObserver> theObservers;

    public Handle(){
        theObservers = new ArrayList<NewsObserver>();
    }

    public void getBBCNews(){
        String news = "New BBC News";
        notifyAllSubs(news);
    }

    public void getFoxNews(){
        String news = "New Fox News";
        notifyAllSubs(news);
    }

    public void getCBCNews(){
        String news = "New CBC News";
        notifyAllSubs(news);
    }

    public void addSub(Subscriber s, String type){
        if(type.equals("bbc")){
            theObservers.get(0).addSub(s);
        }
        else if(type.equals("cbc")){
            theObservers.get(1).addSub(s);
        }
        else if(type.equals("fox")){
            theObservers.get(2).addSub(s);
        }
    }

    public void addObs(NewsObserver o){
        theObservers.add(o);
    }

    public void notifyAllSubs(String news){

        if(news.equals("New BBC News")){
            theObservers.get(0).update();
        }
        else if(news.equals("New CBC News")){
            theObservers.get(1).update();
        }
        else if(news.equals("New Fox News")){
            theObservers.get(2).update();
        }

    }

}
