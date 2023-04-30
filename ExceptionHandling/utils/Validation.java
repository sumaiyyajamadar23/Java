package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import CustomException.LicenceOutOfDate;
import CustomException.SpeedException;

public class Validation {
		private static final int MIN_SPEED;
		private static final int MAX_SPEED;
		public static SimpleDateFormat sdf;
		//public static Date curdate;
		static
		{
			MAX_SPEED=80;
			MIN_SPEED=40;
			sdf=new SimpleDateFormat("dd-MM-yyyy");
		  // curdate=new Date();
			
		}
	public static void ValidateSpeed (int speed) throws SpeedException  
	{
		if(speed > MAX_SPEED)
		throw new SpeedException("Your speed is vary high,slow down!!!!!");
		if(speed < MIN_SPEED)
			throw new SpeedException("Your speed slow !!!!!");
		System.out.println("Speed is Within range ");
	}
	public static Date ValidateLicence(String expDate) throws ParseException, LicenceOutOfDate
	{
		Date curdate=new Date();
		Date expireDate=sdf.parse(expDate);
	    if(expireDate.before(curdate))
		   throw new LicenceOutOfDate("Your licence is expire!!!! renew it" );
       System.out.println("Not expired yet");
  return expireDate;
	
		
	}
	}


