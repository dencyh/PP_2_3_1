package web.service;

import web.dao.UserDao;
import web.dao.UserDaoImpl;
import web.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	@Override
	public void creatTable() {

	}

	@Override
	public void dropTable() {

	}

	@Override
	public void save(User user) {

	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public void deleteById(long id) {

	}

	@Override
	public void updateById(long id, User user) {

	}
}
