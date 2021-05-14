package nLayerdDemo.business.concretes;

import java.util.List;

import nLayerdDemo.business.abstracts.LoginService;
import nLayerdDemo.core.abstracts.CheckService;
import nLayerdDemo.core.abstracts.MailService;
import nLayerdDemo.dataAccess.abstracts.UserDao;
import nLayerdDemo.dataAccess.concretes.HibernateUserDao;
import nLayerdDemo.entities.concretes.User;

public class LoginManager implements LoginService {

	private MailService emailService;
	private CheckService checkService;
	private UserDao userDao;

	public LoginManager(UserDao userDao, CheckService checkService, MailService emailService) {
		super();
		this.userDao = userDao;
		this.checkService = checkService;
		this.emailService = emailService;
	}

	@Override
	public void register(User user) {

		if (!userDao.mailExist(user)) {
			System.out.println("Registration failed! " + user.getMail() + " this e-mail address has been used before.");
			return;
		}
		if (checkService.checkFirstName(user.getFirstName())) {
			System.out.println("Name verified");
		} else {
			return;
		}
		if (checkService.checkLastName(user.getLastName())) {
			System.out.println("Lastname verified!");
		} else {
			return;
		}

		if (checkService.checkEmail(user.getMail())) {
			System.out.println("E-mail verified!");
		} else {
			return;
		}

		if (checkService.checkPassword(user.getPassword())) {
			System.out.println("Password verified!");
		} else {
			return;
		}

		emailService.clickToVerify(user);
		emailService.sendVerifyEmail(user);

		System.out.println("Registration is successful. Welcome " + user.getFirstName());
		userDao.add(user);
	}

	@Override
    public void login(String email, String password) {
        for (User user: userDao.getAll()){
            if(email == user.getMail() && password == user.getPassword()){
                System.out.println("Login successful");
                return;
            }
            else{
                System.out.println("Login failed!");
            }
        }

    }
}