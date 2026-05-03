package hw9;

class Mom implements Runnable {
	Account acc;

	public Mom(Account acc) {
		this.acc = acc;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			acc.deposit();
		}
	}
}

class Son implements Runnable {
	Account acc;

	public Son(Account acc) {
		this.acc = acc;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			acc.withdraw();
		}
	}
}