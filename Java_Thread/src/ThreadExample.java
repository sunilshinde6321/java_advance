// ThreadExample.java
class MyThread extends Thread {

	private String name;

	public MyThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		for(int i = 1; i <= 5; i++) {
			System.out.println(name + " prints: " + i);
			try {

				Thread.sleep(500); // pause for 0.5 second
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

}

public class ThreadExample {
	public static void main(String[] args) {
		// Using Thread subclass
		MyThread thread1 = new MyThread("Thread-1");
		thread1.start(); // start new thread


		System.out.println("Main thread ends.");
	}
}
	