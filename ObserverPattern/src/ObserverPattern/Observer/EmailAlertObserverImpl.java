package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;
/*
 * here we are passing obervable object to the constructor, so when we want any specific data for sending along with it. The great
 * thing here is that we are passing the object of an interface class, so this means that we dont have to pass any 
 */
    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.observable =  observable;
        this.emailId = emailId;
    }

    @Override
    public void update(){
        sendMail(emailId,"Product is in the stock hurry up!");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("mail sent to:" + emailId);
        // just for observation
    }
}