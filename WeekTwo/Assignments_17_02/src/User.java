
public class User {
	public String name;
	public String city;
	public User(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	public String toString() {
		return this.city+" "+this.name;
	}
	
}
