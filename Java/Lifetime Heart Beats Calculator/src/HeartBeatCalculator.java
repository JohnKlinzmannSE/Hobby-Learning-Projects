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
        System.out.print("Please enter your current age in year.");
        userAgeYears = scnr.nextInt();

        //        Output total lifetime heart beats for user
        System.out.print("You are " + userAgeYears + " years old.");
        System.out.println("Your heart has beat " + totalHeartBeats + " times since you were born.");

        //        Calculate Age in Months
        userAgeMonths = userAgeYears * 12;

        System.out.print("Your heart beats " + " every month.");

        //        Calculate Age in Weeks
        userAgeWeeks = userAgeYears * 52;

        //        Calculate Age in Days
        userAgeDays = userAgeYears * 365;

        //        Calculate Age in Hours
        userAgeHours = userAgeDays * 24;

        //        Calculate Age in Minutes
        userAgeMinutes = userAgeHours * 60;

        //        Calculate Age in Seconds
        userAgeSeconds = userAgeMinutes * 60;
        System.out.print("Your heart beats on average " + avgHeartBeatsPerMinute + " times every minute.");

        //        Calculate Total Heart Beats
        totalHeartBeats = userAgeMinutes * avgHeartBeatsPerMinute;


    }
}
