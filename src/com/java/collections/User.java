package src.com.java.collections;

public class User {
	private int age;
	@Override
	public String toString() {
		return "User [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	private String firstName;
	private String lastName;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public User(int age, String firstName, String lastName) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
