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
	public User getUserById(long id) {
		return entityManager.find(User.class, id);
	}

	@Override
	public void saveUser(User user) {
		entityManager.persist(user);
	}

	@Override
	public List<User> getAllUsers() {
		return entityManager
			.createQuery("from User", User.class)
			.getResultList();
	}

	@Override
	public void deleteUserById(long id) {
		entityManager
			.createQuery("delete User u where u.id = :id")
			.setParameter("id", id)
			.executeUpdate();
	}

	@Override
	public void updateUser(User user) {
		entityManager.merge(user);
	}
}
