package nLayerdDemo.business.concretes;

import nLayerdDemo.business.abstracts.LoginService;
import nLayerdDemo.business.abstracts.UserService;
import nLayerdDemo.core.abstracts.GoogleService;
import nLayerdDemo.entities.concretes.User;

public class UserManager implements UserService {

	private LoginService loginService;

	private GoogleService googleService;

	public UserManager(LoginService loginService, GoogleService googleService) {
		this.loginService = loginService;
		this.googleService = googleService;
	}

	@Override
	public void login(String email, String password) {
		 loginService.login(email,password);

	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerGoogle() {
		// TODO Auto-generated method stub

	}

}
