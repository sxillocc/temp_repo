import java.util.*;  

public class sayHello {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your age- "); 
		int age = sc.nextInt();
		if ( age < 18 ) {
			System.out.println("You are child");
		}else {
			System.out.println("You are adult");
		}
	}
}
