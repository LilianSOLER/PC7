package bavards;

public class BavardC extends Thread {
	int id;

	public BavardC(int id) {
		this.id = id;
		this.start();
	}

	public void run() {
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("BavardC " + id + " interrupted while sleeping");
			System.out.println(e);
			System.out.println();
		}
		System.out.println("BavardC " + id + " completed\n");
	}
}
