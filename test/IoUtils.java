package UtilsAll;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import comcode.Empc;

public class IoUtils 
{
public static void store(String filename,Map<String,Empc> em) throws  IOException
{
	try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename)))
	{
		out.writeObject(em);
	}
	catch(IOException i)
	{
		System.out.println(i);
	}
}
@SuppressWarnings("unchecked")
public static Map<String,Empc>restore(String filename)
{
	try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename)))
	{
	return (Map<String,Empc>)in.readObject();
	}
	catch(Exception e)
	{
		System.out.println(e);
		return new HashMap<String,Empc>();
	}
	
}
}
