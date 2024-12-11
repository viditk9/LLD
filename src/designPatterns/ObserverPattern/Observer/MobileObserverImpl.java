package src.designPatterns.ObserverPattern.Observer;


import src.designPatterns.ObserverPattern.Observable.StocksObservable;

public class MobileObserverImpl implements NotificatoinAlertObserver{
    public String MobileNumber;
    StocksObservable observable;
    public MobileObserverImpl(String phoneNumber, StocksObservable observable) {
        this.MobileNumber = phoneNumber;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendSMS(observable.getData());
    }
    public void sendSMS(int newStock) {
        System.out.println("SMS sent to " + MobileNumber + " for new addition of " + newStock + "units");
    }
}
