package bavards;

public class BavardD implements Runnable {
	int id;
	Thread t;

	public BavardD(int id) {
		this.id = id;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("BavardD " + id + " interrupted while sleeping");
			System.out.println(e);
			System.out.println();
		}
		System.out.println("BavardD " + id + " completed\n");
	}

	public void join() throws InterruptedException {
		t.join();
	}
}


