package RunnableTsks;

import java.util.stream.IntStream;

public class AveragePrint implements Runnable
{
private int start;
private int end;

	public AveragePrint(int start, int end)
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
		double avg=IntStream
		.rangeClosed(start, end)//int start ---end-1
		.average()//special case of reduction:Terminal opration
		.orElseThrow();//returns value or NoSuchElementExcepton
		//.forEach(System.out::println);
		System.out.println("Printed by:-"+Thread.currentThread().getName()+"Printed average no:-"+avg);
		}catch (Exception e)
		{
          System.out.println(Thread.currentThread().getName()+"Got execute"+e);		
        }
		System.out.println(Thread.currentThread().getName()+"Over!!!!!");

	}
	

}
