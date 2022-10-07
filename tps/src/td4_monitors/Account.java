package td4_monitors;

public class Account {
	private int balance = 0;

	public Account() {
		this.balance = 0;
	}

	public Account(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return this.balance;
	}

	public synchronized void debitSync(int amount, int id) throws InterruptedException {
		waitBalanceGreaterThan(amount);
		this.balance -= amount;
		System.out.println("Debit: " + amount + " Balance: " + this.balance + " Thread: " + id);
	}

	public synchronized void creditSyn(int amount, int id) {
		this.balance += amount;
		System.out.println("Credit: " + amount + " Balance: " + this.balance + " Thread: " + id);
		notifyAll();
	}

	public synchronized void waitBalanceGreaterThan(float f) throws InterruptedException {
		while (balance < f)
			wait() ;
	}
}
