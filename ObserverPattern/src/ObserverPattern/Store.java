package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store{

    public static void main(String args[]){
        StockObservable iphone = new IphoneObservableImpl();

        NotificationAlertObserver ob1 = new EmailAlertObserverImpl("afc@hotmail.com", iphone);
        NotificationAlertObserver ob2 = new EmailAlertObserverImpl("abc@hotmail.com", iphone);
        NotificationAlertObserver ob3 = new MobileAlertObserverImpl("abvc@hotmail.com", iphone);

        iphone.add(ob1);
        iphone.add(ob2);
        iphone.add(ob3);

        iphone.setStockCount(10);
    }
}