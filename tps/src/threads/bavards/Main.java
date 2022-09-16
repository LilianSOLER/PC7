package bavards;

import static java.lang.Thread.sleep;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		BavardC[] bavardsC;
		BavardD[] bavardsD;

		int nBavards = 200;

		bavardsC = new BavardC[nBavards];
		bavardsD = new BavardD[nBavards];

		for (int i = 0; i < nBavards; i++) {
			bavardsC[i] = new BavardC(i);
			bavardsD[i] = new BavardD(i + nBavards);
		}

		sleep(1000);

		System.out.println("1 second elapsed, interrupting random Bavards\n");

		int random = (int) (Math.random() * nBavards);

		bavardsC[random].interrupt();
		bavardsD[random].t.interrupt();


		for (int i = 0; i < nBavards; i++) {
			bavardsC[i].join();
			bavardsD[i].join();
		}
		System.out.println("That’s all folks!");
	}
}
