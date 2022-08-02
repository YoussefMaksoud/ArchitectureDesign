package MTQuestionSix;

public class Subscriber {

    private String name;

    public Subscriber(String n){
        this.name = n;
    }

    public void displayNewsUpdate(String news){
        System.out.println("\n------------------------ " + name + "\'s" + " Interface ------------------------");
        System.out.println(news);
    }
}
