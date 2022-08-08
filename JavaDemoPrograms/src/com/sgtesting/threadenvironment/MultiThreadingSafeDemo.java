package com.sgtesting.threadenvironment;

class Myclass2 implements Runnable
{
	public void run()
	{
		showoddnumbers();
	}
	synchronized void showoddnumbers()
	{
		System.out.println("Even Numbers: ");
		for(int i=0; i<=10; i++)
		{
			try
			{
				Thread.sleep(1000);
				if(i%2==0)
				{
					System.out.println(Thread.currentThread().getName()+" Display Even Numbers: "+i);
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
		}
	}
}
public class MultiThreadingSafeDemo {

	public static void main(String[] args) {
		
		Myclass2 obj=new Myclass2();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("A ");
		t2.setName("B");
		t1.start();
		t2.start();

	}

}
