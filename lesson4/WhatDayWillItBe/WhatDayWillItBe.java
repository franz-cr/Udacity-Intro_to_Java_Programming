import java.util.Date;
/**
 * Write a description of class WhatDayWillItBe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// BlueJ project: dayOfTheWeek
// Video: Day of the Week

public class WhatDayWillItBe
{
    public static void main(String[] args)
    {
        int weekday = 0;
        // Please do not change the name of this variable
        // We may change this value when we run your program
        // It will always be a date >= January 1, 1900
        Day birthday = new Day(1989, 7, 1);

        // January 1, 1900 was a Monday
        Day originDay = new Day(1900, 1, 1);
        Day testDay = new Day(1900, 1, 12);
        // Compute the number of days from that day until the birthday
        // Compute the weekday: 0 - Sunday, 1 - Monday, ..., 6 - Saturday
        //System.out.println("3) Value(" + value + "): " + ((value * 6) / 256) * 51);
        int numberOfDays = testDay.daysFrom(originDay);
        
        weekday = 1 + (numberOfDays % 7);
        
        System.out.print("Days: ");
        System.out.println(numberOfDays);
        
        System.out.print("Weekday: ");
        System.out.println(weekday);
    }
}