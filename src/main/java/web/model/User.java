package web.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "firstName", nullable = false)
	private String firstName;

	@Column(name = "lastName", nullable = false)
	private String lastName;

	@Transient
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthDate;

	@Column(name = "birthDate", nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private java.sql.Date SQLBirthDate;

	public User() {
	}

	public User(String firstName, String lastName, String email, Date birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthDate = birthDate;
		this.SQLBirthDate = new java.sql.Date(birthDate.getTime());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
		this.SQLBirthDate = new java.sql.Date(birthDate.getTime());
	}

	public java.sql.Date getSQLBirthDate() {
		return SQLBirthDate;
	}

	public void setSQLBirthDate(java.sql.Date SQLBirthDate) {
		this.SQLBirthDate = SQLBirthDate;
	}

	@Override
	public String toString() {
		return "id = " + id +
			   "\nemail = " + email +
			   "\nfirstName = " + firstName +
			   "\nlastName = " + lastName +
			   "\nbirthDate = " + birthDate;
	}
}
