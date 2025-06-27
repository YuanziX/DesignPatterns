package Observer;

public class EmailNotification implements Observer {

    @Override
    public void notifyChange() {
        System.out.println("Send email");
    }

}