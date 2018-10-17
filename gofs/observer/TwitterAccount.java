import java.util.ArrayList;

public class TwitterAccount implements ObservableInterface, ObserverInterface {
    public String username;
    
    private ArrayList<ObserverInterface> observers = new ArrayList<ObserverInterface>();
    
    private Integer numberOfTweets = 0;

    
    public TwitterAccount(String username) {
        this.username = username;
    }

    public void tweet(String message) {
        System.out.println(username + "just tweeted: " + message);
        this.numberOfTweets = this.numberOfTweets + 1;
        this.notifyObservers();
    }

    public void addObserver(ObserverInterface observer) {
        this.observers.add(observer);
    }

    public void notifyObservers() {
        for (ObserverInterface observer : this.observers) {
            observer.update(this);
        }
    }

    public Integer getState() {
        return this.numberOfTweets;
    }

    public void update(ObservableInterface observable) {
        Integer numberOfTweets = observable.getState();
        System.out.println(this.username + ": " + ((TwitterAccount)observable).username + " tweeted " + numberOfTweets.toString() + " time(s).");
    }
}