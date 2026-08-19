package main.java.com.behavioralpatterns.observer.observable.interfaces;

import main.java.com.behavioralpatterns.observer.observers.interfaces.NotificationObserver;

public interface StockObservable {
    public void add(NotificationObserver observer);
    public void remove(NotificationObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newStock);
    public int getStockCount();
}
