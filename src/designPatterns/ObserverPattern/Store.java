package src.designPatterns.ObserverPattern;


import src.designPatterns.ObserverPattern.Observable.IphoneObservableImpl;
import src.designPatterns.ObserverPattern.Observable.StocksObservable;
import src.designPatterns.ObserverPattern.Observer.EmailObserverImpl;
import src.designPatterns.ObserverPattern.Observer.MobileObserverImpl;
import src.designPatterns.ObserverPattern.Observer.NotificatoinAlertObserver;

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
