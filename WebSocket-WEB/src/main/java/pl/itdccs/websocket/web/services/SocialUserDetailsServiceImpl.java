package pl.itdccs.websocket.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;
import org.springframework.stereotype.Service;

/**
 * Created by mc109881 on 2015-05-05.
 */
@Service("socialUserDetailsService")
public class SocialUserDetailsServiceImpl implements SocialUserDetailsService {
	@Autowired
	UserDetailsService userDetailsService;

	@Override
	public SocialUserDetails loadUserByUserId(String s) throws UsernameNotFoundException, DataAccessException {
		return (SocialUserDetails) userDetailsService.loadUserByUsername(s);
	}
}
