package mythreads;

public class Main {
	public static void main(String[] args) {
		PrintSomething print = new PrintSomething();
		ThreadByRunnable t1 = new ThreadByRunnable("Thread-1", print);
		ThreadByRunnable t2 = new ThreadByRunnable("Thread-2", print);
		t1.start();
		t2.start();
	}
}
