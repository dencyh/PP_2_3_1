package web.model;


import javax.persistence.*;
import java.util.function.Function;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "lastName", nullable = false)
	private String lastName;

	@Column(name = "age", nullable = false)
	private byte age;

	public User() {
	}

	public User(String name, String lastName, String email, byte age) {
		Function
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "id = " + id +
			   "\nemail = " + email +
			   "\nname = " + name +
			   "\nlastName = " + lastName +
			   "\nage = " + age;
	}
}
