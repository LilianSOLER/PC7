package bavards;

public class BavardB implements Runnable  {
	int nloops;
	int id;
	Thread t;

	public BavardB(int id, int nloops) {
		this.id = id;
		this.nloops = nloops;
		t = new Thread(this); // create a new thread
		t.start(); // start the thread
	}

	public void run() {
		for (int i = 0; i < nloops; i++) {
			Starter.print("BavardB", id, i); // print bavard B, id and step
			Thread.yield(); // yield to other threads
		}
		System.out.println("BavardB " + id + " completed\n");
	}

	public void join()throws InterruptedException {
		t.join();
	}
}

