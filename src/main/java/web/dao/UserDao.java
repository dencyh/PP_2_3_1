package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
	User getOneById(long id);

	void add(User user);

	List<User> getAll();


	void deleteById(long id);

	void update(User user);
}
