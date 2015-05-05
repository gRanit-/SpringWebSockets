package pl.itdccs.websocket.web.entities;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.social.security.SocialUser;

import java.util.Collection;
import java.util.Set;

/**
 * Created by mc109881 on 2015-05-04.
 */
public class UserDetails extends SocialUser {
	private Long id;
	private String username;
	private String firstname;
	private String lastname;
	private String password;
	private Role role;
	private Set<GrantedAuthority> autorities;
	private SocialMediaService socialSignInProvider;


	public UserDetails(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}

	public UserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities, SocialMediaService socialSignInProvider, String lastname, String firstname, Long id, Role role) {
		super(username, password, authorities);
		this.socialSignInProvider = socialSignInProvider;
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
		this.role = role;
	}

	public Set<GrantedAuthority> getAutorities() {
		return autorities;
	}

	public void setAutorities(Set<GrantedAuthority> autorities) {
		this.autorities = autorities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
