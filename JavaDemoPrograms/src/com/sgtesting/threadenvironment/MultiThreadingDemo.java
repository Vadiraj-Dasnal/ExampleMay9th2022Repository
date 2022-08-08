package com.sgtesting.threadenvironment;

class Myclass1 implements Runnable
{
	public void run()
	{
		showevennumber();
	}
	void showevennumber()
	{
		System.out.println("Even Numbers...");
		for(int i=0; i<=20; i++)
		{
			try
			{
				Thread.sleep(1000);
				if(i%2==0)
				{
					System.out.println(Thread.currentThread().getName()+"Display EvenNumber: "+i);
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreadingDemo {

	public static void main(String[] args) {
		
		Runnable obj=new Myclass1();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.setName("Alpha");
		t2.setName("Gama");
		t1.start();
		t2.start();
	}

}
