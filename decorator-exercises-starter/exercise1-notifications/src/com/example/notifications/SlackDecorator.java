package decorator-exercises-starter.exercise1-notifications.src.com.example.notifications;

public class SlackDecorator {
    private final String channel;

    public SlackDecorator(Notifier wrapped, String channel) {
        super(wrapped);
        this.channel = channel;
    }

    @Override
    public void notify(String text) {
        super.notify(text);
        System.out.println("Slack message to " + channel + ": " + text);
    }
}
