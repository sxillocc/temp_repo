import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {
	public static void main(String args[]) {
		ArrayList<User> userList = new ArrayList<User>();
		
		userList.add(new User("Shaktiraj", "Jaipur"));
		userList.add(new User("Umang", "Gwalior"));
		userList.add(new User("Abhishek", "Mumbai"));
		userList.add(new User("Gopal", "Hyderabad"));
		userList.add(new User("Shashwat", "Ghaziabad"));
		
		System.out.println("Unsorted Data:");
		for(User x: userList) {
			System.out.println(x.toString());
		}
		
		Comparator<User> compareCity = new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				return o1.city.compareTo(o2.city);
			}
			
		};
		
		Collections.sort(userList, compareCity);
		
		System.out.println();
		System.out.println("Sorted Data: ");
		for(User x: userList) {
			System.out.println(x.toString());
		}
	}
}
