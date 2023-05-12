package assistedproject3;

public class SynchronizationDemo {

	   public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000);

	        Thread t1 = new Thread(new DepositThread(account, 500));
	        Thread t2 = new Thread(new WithdrawThread(account, 700));

	        t1.start();
	        t2.start();

	        try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Final balance: " + account.getBalance());
	    }

	    static class BankAccount {
	        private int balance;

	        public BankAccount(int balance) {
	            this.balance = balance;
	        }

	        public int getBalance() {
	            return balance;
	        }

	        public synchronized void deposit(int amount) {
	            balance += amount;
	            System.out.println(Thread.currentThread().getName() + " deposited " + amount + " dollars");
	        }

	        public synchronized void withdraw(int amount) {
	            if (balance >= amount) {
	                balance -= amount;
	                System.out.println(Thread.currentThread().getName() + " withdrew " + amount + " dollars");
	            } else {
	                System.out.println(Thread.currentThread().getName() + " cannot withdraw " + amount + " dollars due to insufficient balance");
	            }
	        }
	    }

	    static class DepositThread implements Runnable {
	        private BankAccount account;
	        private int amount;

	        public DepositThread(BankAccount account, int amount) {
	            this.account = account;
	            this.amount = amount;
	        }

	        @Override
	        public void run() {
	            account.deposit(amount);
	        }
	    }

	    static class WithdrawThread implements Runnable {
	        private BankAccount account;
	        private int amount;

	        public WithdrawThread(BankAccount account, int amount) {
	            this.account = account;
	            this.amount = amount;
	        }

	        @Override
	        public void run() {
	            account.withdraw(amount);
	        }
	    }
	}