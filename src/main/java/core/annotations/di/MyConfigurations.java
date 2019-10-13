package core.annotations.di;
//@MyConfiguration
/**
 * @author MOUNESHBADIGERBadige
 *Annotate only one bean to Inject perticular type
 *If 2 beans of same Autowired Type have been define, any one will be picked randomly
 */
public class MyConfigurations {
	
	//@MyBean(id="emailNotificationService")
	public NotificationService emailNotificationService() {
		return new EmailNotificationService();
	}
	//@MyBean(id="smsNotificationService")
	public NotificationService smsNotificationService() {
		return new SMSNotificationService();
	}
	@MyBean(id="waNotificationService")
	public NotificationService whatsAppNotificationService() {
		return new WhatsAppNotificationService();
	}

}
