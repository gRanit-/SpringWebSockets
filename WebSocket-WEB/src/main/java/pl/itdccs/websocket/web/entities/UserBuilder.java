package pl.itdccs.websocket.web.entities;

public class UserBuilder {
	private Long id;
	private String email;
	private String firstname;
	private String lastname;
	private String password;
	private Role role;
	private SocialMediaService signInProvider;

	public UserBuilder withId(Long id) {
		this.id = id;
		return this;
	}

	public UserBuilder withEmail(String email) {
		this.email = email;
		return this;
	}

	public UserBuilder withFirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}

	public UserBuilder withLastname(String lastname) {
		this.lastname = lastname;
		return this;
	}

	public UserBuilder withPassword(String password) {
		this.password = password;
		return this;
	}

	public UserBuilder withRole(Role role) {
		this.role = role;
		return this;
	}

	public UserBuilder withSignInProvider(SocialMediaService signInProvider) {
		this.signInProvider = signInProvider;
		return this;
	}

	public User createUser() {
		return new User(id, email, firstname, lastname, password, role, signInProvider);
	}
}