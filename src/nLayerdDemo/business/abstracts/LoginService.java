package nLayerdDemo.business.abstracts;

import java.util.List;

import nLayerdDemo.entities.concretes.User;

public interface LoginService {

	void register(User user);
	  void login(String email, String password);


}
