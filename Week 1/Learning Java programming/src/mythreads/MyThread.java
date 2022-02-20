package mythreads;

public class MyThread extends Thread{
	
	//whenever thread starts it first invoke run
	public void run() { //state: Running
		System.out.println("Running");
		//end of execute
	}
	
	public static void main(String[] args) {
		MyThread thread = new MyThread(); // state: New
		thread.start();// state: Runnablle
	}
}
