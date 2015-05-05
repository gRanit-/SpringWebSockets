package pl.itdccs.websocket.web.dao;

import pl.itdccs.websocket.web.entities.User;

import java.util.List;

/**
 * Created by mc109881 on 2015-05-04.
 */
public interface UserDAO {
	public void save(User user);

	public List<User> list();

	public void delete(User user);

	public User get(String username);

	public User get(Long id);
}
