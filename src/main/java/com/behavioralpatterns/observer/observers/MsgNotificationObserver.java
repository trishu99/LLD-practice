package main.java.com.behavioralpatterns.observer.observers;

import main.java.com.behavioralpatterns.observer.observable.interfaces.StockObservable;
import main.java.com.behavioralpatterns.observer.observers.interfaces.NotificationObserver;

public class MsgNotificationObserver implements NotificationObserver {
    StockObservable observable;
    String mobileNo;

    public MsgNotificationObserver(String mobileNo, StockObservable observable){
        this.mobileNo = mobileNo;
        this.observable = observable;
    }

    public void update(){
        sendMsg(mobileNo, "product is back in stock now with count: " + observable.getStockCount());
    }

    private void sendMsg(String mobileNo, String msg){
        System.out.println("msg sent to: " + mobileNo + " with msg: " + msg);
    }
}
