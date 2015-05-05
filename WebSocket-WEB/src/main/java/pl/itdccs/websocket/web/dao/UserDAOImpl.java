package pl.itdccs.websocket.web.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.itdccs.websocket.web.entities.User;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mc109881 on 2015-05-05.
 */

@Repository
public class UserDAOImpl implements UserDAO {
	Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void save(User user) {
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			Transaction tx = session.getTransaction();
			session.persist(user);
			tx.commit();

		} catch (Throwable throwable) {
			logger.error(throwable.getMessage(), throwable);
		} finally {
			if (session != null)
				try {
					session.close();
				} catch (Throwable throwable) {
					logger.error(throwable.getMessage(), throwable);
				}
		}
	}

	@Override
	public List<User> list() {
		List<User> userList = new LinkedList<>();
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			Transaction tx = session.getTransaction();
			List<User> tempList = session.createQuery("from User").list();
			if (tempList != null)
				userList.addAll(tempList);
			tempList = null;
		} catch (Throwable throwable) {

		} finally {
			if (session != null) try {
				session.close();
			} catch (Throwable throwable) {
			}
		}
		return userList;
	}

	@Override
	public void delete(User user) {

		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			Transaction tx = session.getTransaction();
			session.delete(user);
		} catch (Throwable throwable) {

		} finally {
			if (session != null) try {
				session.close();
			} catch (Throwable throwable) {
			}
		}
	}

	@Override
	public User get(String username) {
		User user = null;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			Transaction tx = session.getTransaction();
			user = (User) session.createCriteria(User.class).add(Restrictions.eq("email", username)).uniqueResult();

		} catch (Throwable throwable) {

		} finally {
			if (session != null) try {
				session.close();
			} catch (Throwable throwable) {
			}
		}
		return user;
	}

	@Override
	public User get(Long id) {
		User user = null;
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			Transaction tx = session.getTransaction();
			user = (User) session.get(User.class,id);

		} catch (Throwable throwable) {

		} finally {
			if (session != null) try {
				session.close();
			} catch (Throwable throwable) {
			}
		}
		return user;
	}
}
