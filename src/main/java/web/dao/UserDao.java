package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
	void creatTable();

	void dropTable();

	void add(User user);

	List<User> getAll();

	void deleteById(long id);

	void updateById(long id, User user);
}
