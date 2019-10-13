package core.annotations.di;

public class Consumer {

	NotificationService notificationService;
	
	@AutowireDependecy
	public Consumer(NotificationService notificationService) {
		this.notificationService=notificationService;
	}
	
	public void purchase() {
		System.out.println("order placed");
		notificationService.sendNotification();
	}



	
	
	
	

}
