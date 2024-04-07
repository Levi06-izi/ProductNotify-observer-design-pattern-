package ObserverPattern.Observer;

/*
this observer is observing all the subscribed stocks and, it has a responsibility to notify all the subscribers when update is called
from observables' implementation, here these both have a 'has-a' relation which is also said as composition
*/ 
public interface NotificationAlertObserver{

    public void update();
}