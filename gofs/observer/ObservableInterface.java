public interface ObservableInterface {
    public void addObserver(ObserverInterface observer);

    public void notifyObservers();

    public Integer getState();
}