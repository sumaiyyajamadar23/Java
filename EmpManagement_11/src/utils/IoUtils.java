package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.app.core.Emp;

public class IoUtils 
{
	public static void StoreCustomDetail(String Filename,Map<String,Emp> empMap) throws IOException
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(Filename)))
		{
			out.writeObject(empMap);
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
		
	}
	@SuppressWarnings("unchecked")
	public static Map<String, Emp>restore(String Filename)
	{
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(Filename)))
		{
			return ( Map<String, Emp>)in.readObject();
		}
		catch(Exception e)
		{
			System.out.println(e);
		return new HashMap<String, Emp>();
		}
		
	}
}


