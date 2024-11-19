package designPatterns.ObserverPattern.Observable;

import designPatterns.ObserverPattern.Observer.NotificatoinAlertObserver;

public interface StocksObservable {
    public void add(NotificatoinAlertObserver notificatoinAlertObserver);
    public void remove(NotificatoinAlertObserver notificatoinAlertObserver);
    public void notifySubscribers();
    public void setStocksCount(int newStocksAdded);
    public int getData();
}
