package nLayerdDemo.core.concretes;

import nLayerdDemo.core.abstracts.MailService;
import nLayerdDemo.entities.concretes.User;

public class MailManager implements MailService {
	@Override
	public void sendVerifyEmail(User user) {
		System.out.println("Your verification e-mail has been sent to your address: " + user.getMail());

	}

	@Override
	public void clickToVerify(User user) {
		System.out.println("Click on the link to verify your registration: " + user.getFirstName());

	}

}