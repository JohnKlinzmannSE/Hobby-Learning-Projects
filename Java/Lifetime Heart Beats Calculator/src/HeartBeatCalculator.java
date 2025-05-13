import java.util.Scanner;

public class HeartBeatCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userAgeYears;
        int userAgeMonths;
        int userAgeWeeks;
        int userAgeDays;
        int userAgeHours;
        int userAgeMinutes;
        int userAgeSeconds;
        int totalHeartBeats = 0;
        int avgHeartBeatsPerMinute = 72;
        int totalMonthlyHeartBeats;
        int totalWeeklyHeartBeats;
        int totalDailyHeartBeats;
        int totalHourlyHeartBeats;
        int totalHeartBeatsPerSecond;

        //        Get user age from user input
        System.out.println("Please enter your current age in years.");
        userAgeYears = scnr.nextInt();

        //        Calculate age in months and output to user
        userAgeMonths = userAgeYears * 12;
        System.out.println("Your have been alive for " + userAgeMonths + " months.");

        //        Calculate total heart beats per month and output to user
        System.out.println("Your heart beats " + " every month.");

        //        Calculate age in weeks
        userAgeWeeks = userAgeYears * 52;

        //        Calculate age in days
        userAgeDays = userAgeYears * 365;

        //        Calculate age in hours
        userAgeHours = userAgeDays * 24;

        //        Calculate age in minutes and output to user
        userAgeMinutes = userAgeHours * 60;
        System.out.println("Your have been alive for " + userAgeMinutes + " minutes.");

//        Output total heartbeats per minute
        System.out.println("Your heart beats " + avgHeartBeatsPerMinute + " times every minute.");


        //        Calculate age in seconds
        userAgeSeconds = userAgeMinutes * 60;
        System.out.println("Your have been alive for " + userAgeSeconds + " seconds.");

        //        Calculate heart beats per second
        totalHeartBeatsPerSecond = avgHeartBeatsPerMinute / 60;
        System.out.println("Your heart beats on average " + totalHeartBeatsPerSecond + " times every second.");

        //        Calculate total heart beats
        totalHeartBeats = userAgeMinutes * avgHeartBeatsPerMinute;

        //        Output total lifetime heart beats for user
        System.out.println("You are " + userAgeYears + " years old.");
        System.out.println("Your heart has beat " + totalHeartBeats + " times since you were born.");

    }
}
