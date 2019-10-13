package core.annotations.di;

public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification() {
		System.out.println(	"Sending Email");

	}

}
