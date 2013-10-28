package com.tutorials_point.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/28/13
 * Time: 12:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class DateTime {

    /* Sometime you may need to measure point in time in milliseconds.
       So let's re-write above example once again
    */
    private static void measuringElapsedTime(){
        System.out.println("\n\n******* Measuring Elapsed Time *******");
        long start = System.currentTimeMillis();
        System.out.println(new Date());
        try {
            Thread.sleep(5*60*10); // 3 seconds
        } catch (InterruptedException e) {
            System.out.println("Got a Interrupted Exception or Thread.sleep exception");
        }
        System.out.println(new Date());
        long end = System.currentTimeMillis();
        long diff = end - start;
        System.out.println("Difference is: " + diff);
    }

    /* GregorianCalendar is a concrete implementation of a Calendar class
       that implements the normal Gregorian calendar
    */
    private static void gregorianCalendar(){
        System.out.println("\n****** GregorianCalendar Class");
        GregorianCalendar gc = (GregorianCalendar) GregorianCalendar.getInstance();

        System.out.println("Calendar Month: " + gc.get(Calendar.MONTH));
        System.out.println("Calendar Date: " + gc.get(Calendar.DATE));
        System.out.println("Caledar Year: " + gc.get(Calendar.YEAR));
        System.out.println("Calendar Hour: " + gc.get(Calendar.HOUR));
        System.out.println("Calendar Minute: " + gc.get(Calendar.MINUTE));
        System.out.println("Calendar Second: " + gc.get(Calendar.SECOND));

        // Test if the current year is a leap year
        if(gc.isLeapYear(gc.get(Calendar.YEAR))){
            System.out.println("The current year is a leap year");
        }
        else{
            System.out.println("The current year is a not a leap year");
        }
    }


    public static void main(String[] args){
        // instantiate a Date object
        Date date = new Date();
        // display time and date using toString
        System.out.println("Date: " + date.toString());

        // Date Comparison test
        Date date2 = new Date();
        System.out.println("Date2: " + date2.toString());
        System.out.println("\n****** Date Comparison *********");
        System.out.println("Date2 get time: " + date2.getTime());
        System.out.println("Date Before Date2: " + date.before(date2));
        System.out.println("Date After Date2: " + date.after(date2));
        System.out.println("Date Equals Date2: " + date.equals(date2));
        System.out.println("Date compareTo Date2: " + date.compareTo(date2));

        // Date formatting using SimpleDateFormat
        System.out.println("\n****** Date Formatting using SimpleDateFormat ********");
        SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy.MM.dd "
                                        + "'at' hh:mm:ss a zzz");
        System.out.println("Date: " + dateFormat.format(date));
        System.out.println("Date2: " + dateFormat.format(date2));
         /* The SimpleDateFormat class has some additional methods, notably
        parse( ) , which tries to parse a string according to the format stored
        in the given SimpleDateFormat object. For example:
        */
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String input = (args.length == 0) ? "1818-11-11" : args[0];
        System.out.print(input + " Parses as ");
        Date t = null;
        try {
            t = dateFormat.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + dateFormat);
        }

        // Date formatting using printf
        System.out.println("\n****** Date Formatting using printf *********");
        String str = String.format("Date: %tc", date);
        System.out.println(str);
        String str2 = String.format("Date2: %tc\n", date2);
        System.out.printf(str2);
        System.out.flush();
        /* It would be a bit silly if you had to supply the date multiple times
         to format each part. For that reason, a format string can indicate the
         index of the argument to be formatted.

         The index must immediately follow the %, and it must be terminated by
         a $. For example:
        */
        System.out.printf("%1$s %2$tB %2$td, %2$tY \n",
                          "Due date:", date);
        /* Alternatively, you can use the < flag. It indicates that the same
        argument as in the preceding format specification should be used again. For example:
        */
        System.out.printf("%s %tB %<te, %<tY", "Due date:", date);


        /* Sometime you may need to measure point in time in milliseconds.
           So let's re-write above example once again
        */
        measuringElapsedTime();

        /* GregorianCalendar Class */
        gregorianCalendar();


    }
}
