package Observer;

public class TweetNotification implements Observer {

    @Override
    public void notifyChange() {
        System.out.println("Tweet");
    }

}