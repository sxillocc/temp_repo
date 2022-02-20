package consumer;
import java.util.function.Consumer;

//Predicate
//abstract method boolean test(T t)

//Consumer is a Functionl Interface
//abstract method void accept(T t)
//It do not return anything

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1096, "Sanatan");
		Student s2 = new Student(1092, "Shaktiraj");
		
		Consumer<Student> mConsumer = (i)->{System.out.println(i.getId()+" "+i.getName());};
		mConsumer.accept(s1);
		mConsumer.accept(s2);
	}

}
