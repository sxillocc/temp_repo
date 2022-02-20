package mythreads;

public class ThreadByRunnable implements Runnable{
	
	private Thread t;
	private String threadName;
	
	private PrintSomething print;
	
	public ThreadByRunnable(String name, PrintSomething print) {
		threadName = name;
		this.print = print;
	}
	
	public synchronized void printthread(int i) {
//		lock.lock();
		try {
			for(i=0; i<5; i++) {
				System.out.println("i: "+i+" : "+threadName);
				Thread.sleep(100);
			}
		}catch(Exception e) {
			System.out.println("Exception: "+e);
		}
//		lock.unlock();
	}
	
	public void run() {
		System.out.println("Inside Thread");
		print.printer(5, threadName);
		System.out.println("Thread is terminating");
	}
	public void start() {
		System.out.println("Inside thread start function of threadname: "+threadName);
		if(t==null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}



