package pl.itdccs.websocket.web.entities;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class UserDetailsBuilder {
	private Long id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private boolean enabled;
	private boolean accountNonExpired;
	private boolean credentialsNonExpired;
	private boolean accountNonLocked;
	private Collection<? extends GrantedAuthority> authorities;
	private SocialMediaService socialSignInProvider;
	private Role role;

	public UserDetailsBuilder withRole(Role role) {
		this.role = role;
		return this;
	}

	public UserDetailsBuilder withId(Long id) {
		this.id = id;
		return this;
	}

	public UserDetailsBuilder withUsername(String username) {
		this.username = username;
		return this;
	}

	public UserDetailsBuilder withFirstName(String firstName) {
		this.firstname = firstName;
		return this;
	}

	public UserDetailsBuilder withLastName(String lastName) {
		this.lastname = lastName;
		return this;
	}

	public UserDetailsBuilder withPassword(String password) {
		this.password = password;
		return this;
	}

	public UserDetailsBuilder withEnabled(boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	public UserDetailsBuilder withAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
		return this;
	}

	public UserDetailsBuilder withCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
		return this;
	}

	public UserDetailsBuilder withAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
		return this;
	}

	public UserDetailsBuilder withAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
		return this;
	}

	public UserDetailsBuilder withSocialSignInProvider(SocialMediaService socialSignInProvider) {
		this.socialSignInProvider = socialSignInProvider;
		return this;
	}

	public UserDetails createUserDetails() {
		return new UserDetails(username, password, authorities, socialSignInProvider, lastname, firstname, id, role);
	}
}