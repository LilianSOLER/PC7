package td4_monitors;

public class Threads extends Thread {
		private int nLoops = 0;
		private Account account = null;

		private int id = 0;

		public Threads(Account account, int nLoops, int id) {
				this.account = account;
				this.nLoops = nLoops;
				this.id = id;
				this.start();
		}

		public void run() {
			int randomDebit = 0;
			int randomCredit = 0;
			for(int i = 0; i < this.nLoops - 1; i++) {
				randomDebit = (int) (Math.random() * 100);
				randomCredit = (int) (Math.random() * 100);
				this.account.creditSyn(randomCredit, this.id);
				try {
					this.account.debitSync(randomDebit, this.id);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		}
}
