package main.java.com.behavioralpatterns.observer.observable;

import main.java.com.behavioralpatterns.observer.observable.interfaces.StockObservable;
import main.java.com.behavioralpatterns.observer.observers.interfaces.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockObservable {
    List<NotificationObserver> observerList = new ArrayList<>();
    int stocks;

    public void add(NotificationObserver observer){
        observerList.add(observer);
    }

    public void remove(NotificationObserver observer){
        observerList.remove(observer);
    }

    public void notifySubscribers(){
        for(NotificationObserver observer : observerList){
            observer.update();
        }
    }

    public void setStockCount(int newStock){
        if(stocks == 0){
            stocks = stocks + newStock;
            notifySubscribers();
        }
        else
            stocks = stocks + newStock;
    }

    public int getStockCount(){
        return stocks;
    }
}
