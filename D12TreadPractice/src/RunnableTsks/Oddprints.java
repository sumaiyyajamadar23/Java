package RunnableTsks;

import java.util.stream.IntStream;

public class Oddprints implements Runnable
{
	
		private int start;
		private int end;

		public Oddprints(int start, int end)
		{
		super();
		this.start = start;
		this.end = end;
		System.out.println("constructor invoked by:"+Thread.currentThread().getName());
	    }

		@Override
		public void run() 
		{
			System.out.println(Thread.currentThread().getName()+"Startedd!!!");
			try
			{
			IntStream
			.rangeClosed(start,end)//int start ---end-1
			.filter(i->i%2!=0)
			//.forEach(System.out::println);
			.forEach(i->System.out.println(Thread.currentThread().getName()+"Printed Odd no:-"+i));
			}catch (Exception e)
			{
	          System.out.println(Thread.currentThread().getName()+"Got execute"+e);		
	        }
			System.out.println(Thread.currentThread().getName()+"Over!!!!!");

		}
		

	}


