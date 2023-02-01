package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;

@Repository
public class UserDaoImpl implements UserDao {
	@PersistenceContext(unitName = "main")
	private EntityManager entityManager;

	@Override
	public void creatTable() {
	}

	@Override
	public void dropTable() {

	}

	@Override
	public void add(User user) {

	}

	@Override
	public List<User> getAll() {
		System.out.println(entityManager);
		return entityManager
			.createQuery("from User", User.class)
			.getResultList();
	}

	@Override
	public void deleteById(long id) {

	}

	@Override
	public void updateById(long id, User user) {
	}
}
