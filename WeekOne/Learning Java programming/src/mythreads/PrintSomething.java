package mythreads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintSomething {
	private Lock lock;
	
	public PrintSomething(){
		this.lock = new ReentrantLock();
	}
	
	public void printer(int i, String name) {
		lock.lock();
		for(int k=0; k<i; k++) {
			System.out.println("k= "+k+": name= "+name);
		}
		lock.unlock();
	}
}
