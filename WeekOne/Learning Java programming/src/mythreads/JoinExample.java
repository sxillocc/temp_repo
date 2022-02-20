package mythreads;

public class JoinExample {
	
	public static void main(String[] args) {
		
		System.out.println("Main thread started");
		
		Thread t1 = new Thread(){
			public void run() {
				System.out.println("t1 thread started");
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("t1 thread ends");
			}
		};
		
		t1.start();
		
		try {
			t1.join();
		}catch(Exception e) {
			
		}
		System.out.println("Main thread ended");
		
		
	}

}
