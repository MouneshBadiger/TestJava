package core.annotations.di;

public class WhatsAppNotificationService implements NotificationService {

	@Override
	public void sendNotification() {
		System.out.println("Sending whats app message");
		

	}

}
