package com.simpli;

public class MyThread implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyThread mythread = new MyThread();
		  
	        // pass the runnable reference to Thread
	        Thread t = new Thread(mythread, "Thread");
	  
	        // start the thread
	        t.start();
	  
	        // get the name of the thread
	        System.out.println(t.getName());
	    }
	    @Override public void run()
	    {
	        System.out.println("Inside run method");
	}

}
