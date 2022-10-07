package td4_monitors;

import threads.td3.ThreadCount;

public class Main{
	public static void main(String[] args) throws InterruptedException {
		int nThreads = 10;
		int nLoops = 10;

		Account account = new Account();

		Threads[] threads = new Threads[nThreads];

		for(int i = 0; i < nThreads; i++) {
			threads[i] = new Threads(account, nLoops, i);
		}


		for(int i = 0; i < nThreads; i++) {
			threads[i].join();
		}
	}
}
