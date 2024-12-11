package src.designPatterns.ObserverPattern.Observable;


import src.designPatterns.ObserverPattern.Observer.NotificatoinAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    List<NotificatoinAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    public IphoneObservableImpl() {
        stockCount=0;
    }
    @Override
    public void add(NotificatoinAlertObserver notificatoinAlertObserver) { observerList.add(notificatoinAlertObserver);}
    @Override
    public void remove(NotificatoinAlertObserver notificatoinAlertObserver) {observerList.remove(notificatoinAlertObserver);}
    @Override
    public void notifySubscribers() {
        for(NotificatoinAlertObserver observer : observerList) {
            observer.update();
        }
    }
    @Override
    public void setStocksCount(int newStocksAdded) {
        stockCount += newStocksAdded;
        if(stockCount == newStocksAdded) notifySubscribers();
    }
    @Override
    public int getData() {
        return stockCount;
    }
}
