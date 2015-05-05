package pl.itdccs.websocket.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.itdccs.websocket.web.dao.UserDAO;
import pl.itdccs.websocket.web.entities.User;
import pl.itdccs.websocket.web.entities.UserDetailsBuilder;

/**
 * Created by mc109881 on 2015-05-04.
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl implements org.springframework.security.core.userdetails.UserDetailsService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		User user = userDAO.get(s);
		//pl.itdccs.websocket.web.entities.UserDetails = new pl.itdccs.websocket.web.entities.UserDetails();

		return user == null ? null : new UserDetailsBuilder()
				.withFirstName(user.getFirstname())
				.withLastName(user.getLastname())
				.withPassword(user.getPassword())
				.withUsername(user.getEmail())
				.withId(user.getId())
				.withRole(user.getRole())
				.withSocialSignInProvider(user.getSignInProvider())
				.createUserDetails();
	}


}
