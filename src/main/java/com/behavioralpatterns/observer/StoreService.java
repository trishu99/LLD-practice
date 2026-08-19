package main.java.com.behavioralpatterns.observer;

import main.java.com.behavioralpatterns.observer.observable.IphoneStockObservableImpl;
import main.java.com.behavioralpatterns.observer.observable.interfaces.StockObservable;
import main.java.com.behavioralpatterns.observer.observers.EmailNotificationObserver;
import main.java.com.behavioralpatterns.observer.observers.MsgNotificationObserver;
import main.java.com.behavioralpatterns.observer.observers.interfaces.NotificationObserver;

public class StoreService {
    public void run(){
        StockObservable iphoneStockObservable = new IphoneStockObservableImpl();

        NotificationObserver observer1 = new EmailNotificationObserver("mahima@gmail.com", iphoneStockObservable);
        NotificationObserver observer2 = new MsgNotificationObserver("9172663433", iphoneStockObservable);
        NotificationObserver observer3 = new EmailNotificationObserver("neha@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(100);

        int currStock = iphoneStockObservable.getStockCount();
        iphoneStockObservable.setStockCount(-currStock);

        iphoneStockObservable.remove(observer3);

        iphoneStockObservable.setStockCount(20);




    }
}
