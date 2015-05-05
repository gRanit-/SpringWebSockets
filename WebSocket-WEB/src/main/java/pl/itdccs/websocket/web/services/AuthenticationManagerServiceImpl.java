package pl.itdccs.websocket.web.services;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * Created by mc109881 on 2015-05-05.
 */
public class AuthenticationManagerServiceImpl implements AuthenticationManager {
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		return null;
	}
}
