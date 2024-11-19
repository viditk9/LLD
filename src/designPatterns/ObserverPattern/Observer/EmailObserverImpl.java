package designPatterns.ObserverPattern.Observer;

import designPatterns.ObserverPattern.Observable.StocksObservable;

public class EmailObserverImpl implements NotificatoinAlertObserver{
    public String emailId;
    StocksObservable observable;
    public EmailObserverImpl(String mailId, StocksObservable observable){
        this.emailId = mailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMail(observable.getData());
    }
    public void sendMail(int newStock) {
        System.out.println("mail sent to " + emailId + " for new addition of " + newStock + "units");
    }
}
