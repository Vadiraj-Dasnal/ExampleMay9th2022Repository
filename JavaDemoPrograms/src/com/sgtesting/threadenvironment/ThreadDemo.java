package com.sgtesting.threadenvironment;

class Myclass implements Runnable
{
	public void run()
	{
		System.out.println("It is a Runnable Method");
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		Myclass obj=new Myclass();
		
		Thread o=new Thread(obj);
		o.start();
	}

}
