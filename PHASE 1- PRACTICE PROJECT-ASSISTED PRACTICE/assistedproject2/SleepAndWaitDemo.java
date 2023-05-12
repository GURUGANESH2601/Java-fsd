package assistedproject2;

public class SleepAndWaitDemo {

	   public static void main(String[] args) {
	        Thread t1 = new Thread(new MyThread());
	        Thread t2 = new Thread(new MyThread());

	        t1.start();
	        t2.start();
	    }

	    static class MyThread implements Runnable {
	        @Override
	        public void run() {
	            synchronized (this) {
	                try {
	                    System.out.println(Thread.currentThread().getName() + " is going to sleep for 5 seconds");
	                    Thread.sleep(5000);
	                    System.out.println(Thread.currentThread().getName() + " woke up from sleep");

	                    System.out.println(Thread.currentThread().getName() + " is waiting");
	                    wait();
	                    System.out.println(Thread.currentThread().getName() + " is awake now");
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }
	}