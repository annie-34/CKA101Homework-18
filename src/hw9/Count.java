package hw9;

class Account {
	private int balance = 0;

	public synchronized void deposit() {
		while (balance > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				wait();
			} catch (Exception e) {
			}
		}

		balance += 2000;
		System.out.println("媽媽存了2000，帳戶共有：" + balance);

		notifyAll(); // ⭐叫醒熊大
	}

	public synchronized void withdraw() {
		while (balance < 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			try {
				wait();
			} catch (Exception e) {
			}
		}

		balance -= 1000;
		System.out.println("熊大領了1000，帳戶共有：" + balance);

		notifyAll(); // ⭐叫醒媽媽
	}
}