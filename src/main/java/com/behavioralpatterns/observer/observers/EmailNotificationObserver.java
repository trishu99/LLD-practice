package main.java.com.behavioralpatterns.observer.observers;

import main.java.com.behavioralpatterns.observer.observable.interfaces.StockObservable;
import main.java.com.behavioralpatterns.observer.observers.interfaces.NotificationObserver;

public class EmailNotificationObserver implements NotificationObserver {
    StockObservable observable;
    String emailID;

    public EmailNotificationObserver(String emailID, StockObservable observable){
        this.emailID = emailID;
        this.observable = observable;
    }

    public void update(){
        sendMail(emailID, "product is in stock now with count: " + observable.getStockCount());
    }

    private void sendMail(String emailID, String msg){
        System.out.println("mail sent to: " + emailID + " with msg: " + msg);
    }
}
