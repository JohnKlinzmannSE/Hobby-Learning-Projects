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

        //  Get user age from user input
        System.out.println("Please enter your current age in years.");
        userAgeYears = scnr.nextInt();

        //  Calculate age in months and output to user
        userAgeMonths = userAgeYears * 12;
        System.out.println("Your have been alive for " + userAgeMonths + " months.");

        //  Calculate total heart beats per month and output to user
        System.out.println("Your heart beats " + " every month.");

        //  Calculate total heart beats per month


        //  Calculate age in weeks and output to user
        userAgeWeeks = userAgeYears * 52;
        System.out.println("Your have been alive for " + userAgeWeeks + " weeks.");

        //  Calculate total heart beats per week


        //  Calculate age in days and output to user
        userAgeDays = userAgeYears * 365;
        System.out.println("Your have been alive for " + userAgeDays + " days.");

        //  Calculate total heart beats per day
        totalDailyHeartBeats = (avgHeartBeatsPerMinute * 60) * 24;
        System.out.println("Your heart has beat " + totalDailyHeartBeats + " times every day.");

        //  Calculate age in hours and output to user
        userAgeHours = userAgeDays * 24;
        System.out.println("Your have been alive for " + userAgeHours + " hours.");

        //  Calculate total heart beats per hour and output to user
        totalHourlyHeartBeats = avgHeartBeatsPerMinute * 60;
        System.out.println("Your heart has beat " + totalHourlyHeartBeats + " times every hour.");

        //  Calculate age in minutes and output to user
        userAgeMinutes = userAgeHours * 60;
        System.out.println("Your have been alive for " + userAgeMinutes + " minutes.");

        //  Output total heartbeats per minute to user
        System.out.println("Your heart beats " + avgHeartBeatsPerMinute + " times every minute.");

        //  Calculate age in seconds and output to user
        userAgeSeconds = userAgeMinutes * 60;
        System.out.println("Your have been alive for " + userAgeSeconds + " seconds.");

        //  Calculate heart beats per second and output to user
        totalHeartBeatsPerSecond = avgHeartBeatsPerMinute / 60;
        System.out.println("Your heart beats on average " + totalHeartBeatsPerSecond + " times every second.");

        //  Calculate total lifetime heart beats and output to user along with current age in years
        totalHeartBeats = userAgeMinutes * avgHeartBeatsPerMinute;
        System.out.println("You are " + userAgeYears + " years old.");
        System.out.println("Your heart has beat " + totalHeartBeats + " times since you were born.");
    }
}
