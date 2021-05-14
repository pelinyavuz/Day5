package nLayerdDemo.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import nLayerdDemo.entities.concretes.User;

public interface UserDao {

	void add(User user);

	void delete(User user);

	List<User> getAll();

	boolean mailExist(User user);

}
