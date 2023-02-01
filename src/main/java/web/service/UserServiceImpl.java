package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	private final UserDao userDao;

	@Autowired
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void creatTable() {

	}

	@Override
	public void dropTable() {

	}

	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public void deleteById(long id) {
		userDao.deleteById(id);
	}

	@Override
	public void updateById(long id, User user) {

	}
}
