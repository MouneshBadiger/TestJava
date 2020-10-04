package test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestNew {
	
	public static void main(String[] args) {
		/*
		 * String str="name   at one tow there"; String str1="name one thereat";
		 * 
		 * 
		 * Pattern p = Pattern.compile("\\sat\\s"); Matcher m = p.matcher(str);
		 * System.out.println(m.find());
		 */
	    ScheduledExecutorService ses = null;
	    ScheduledFuture<?> scheduledFuture = null;
        ses = Executors.newScheduledThreadPool(1);
        scheduledFuture = ses.scheduleAtFixedRate(()->System.out.println("--RUnnable running----"), 1, 2,TimeUnit.SECONDS);
	}

}
