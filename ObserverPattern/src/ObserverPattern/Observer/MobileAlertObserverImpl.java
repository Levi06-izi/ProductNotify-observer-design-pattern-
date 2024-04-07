package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String username;
    StockObservable obervable;

    public MobileAlertObserverImpl(String emailId, StockObservable obervable){
        this.obervable = obervable;
        this.username = emailId;
    }

    @Override
    public void update() {
        sendMsgMobile(username,"product is in stock hurry up/!");
    }

    private void sendMsgMobile(String username, String msg){
        System.out.println("Msg sent to :" + username);
    }
}