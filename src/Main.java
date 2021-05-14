import nLayerdDemo.business.abstracts.UserService;
import nLayerdDemo.business.concretes.LoginManager;
import nLayerdDemo.business.concretes.UserManager;
import nLayerdDemo.core.adapters.GoogleManagerAdapter;
import nLayerdDemo.core.concretes.MailCheckManager;
import nLayerdDemo.core.concretes.MailManager;
import nLayerdDemo.dataAccess.concretes.HibernateUserDao;
import nLayerdDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(
				new LoginManager(new HibernateUserDao(), new MailCheckManager(), new MailManager()),
				new GoogleManagerAdapter());

		User gizem = new User("Pelin", "Yavuz", "pelinnyvz@gmail.com", "98765");

		userService.register(gizem);
		userService.login("pelinnyvz@gmail.com", "98765");

		userService.registerGoogle();

	}
}