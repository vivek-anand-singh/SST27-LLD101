package decorator-exercises-starter.exercise1-notifications.src.com.example.notifications;

public class WhatsappDecorator extends NotifierDecorator {
    private final String userId;

    public WhatsappDecorator(Notifier wrapped, String userId) {
        super(wrapped);
        this.userId = userId;
    }

    @Override
    public void notify(String text) {
        super.notify(text);
        System.out.println("💬 WhatsApp message to " + userId + ": " + text);
    }
}
