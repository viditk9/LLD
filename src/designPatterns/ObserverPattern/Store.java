package designPatterns.ObserverPattern;

import designPatterns.ObserverPattern.Observable.IphoneObservableImpl;
import designPatterns.ObserverPattern.Observable.StocksObservable;
import designPatterns.ObserverPattern.Observer.EmailObserverImpl;
import designPatterns.ObserverPattern.Observer.MobileObserverImpl;
import designPatterns.ObserverPattern.Observer.NotificatoinAlertObserver;

public class Store {
    public static void main(String args[]) {
        StocksObservable iphoneObservable = new IphoneObservableImpl();

        NotificatoinAlertObserver observer1 = new EmailObserverImpl("messi@gmail.com", iphoneObservable);
        NotificatoinAlertObserver observer2 = new MobileObserverImpl("9827881561", iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);

        iphoneObservable.setStocksCount(1);
    }
}
