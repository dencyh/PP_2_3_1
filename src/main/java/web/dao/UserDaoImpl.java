package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.*;

@Repository
public class UserDaoImpl implements UserDao {
	@PersistenceContext(unitName = "main")
	private EntityManager entityManager;

	@Override
	public User getOneById(long id) {
		return entityManager.find(User.class, id);
	}

	@Override
	@Transactional
	public void add(User user) {
		entityManager.persist(user);
	}

	@Override
	public List<User> getAll() {
		return entityManager
			.createQuery("from User", User.class)
			.getResultList();
	}

	@Override
	@Transactional
	public void deleteById(long id) {
		entityManager
			.createQuery("delete User u where u.id = :id")
			.setParameter("id", id)
			.executeUpdate();
	}

	@Override
	@Transactional
	public void update(User user) {
		entityManager.merge(user);
	}
}
