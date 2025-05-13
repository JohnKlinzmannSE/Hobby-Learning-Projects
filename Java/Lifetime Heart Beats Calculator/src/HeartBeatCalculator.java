import java.util.Scanner;

public class HeartBeatCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        int userAgeYears;
        int userAgeMonths;
        int userAgeWeeks;
        int userAgeDays;
        int userAgeHours;
        int userAgeMinutes;
        int userAgeSeconds;
        int totalHeartBeats;
        int avgHeartBeatsPerMinute = 72;

//        Get user age from user input
        System.out.print("Please enter your current age in year.");
        userAgeYears = scnr.nextInt();

//        Calculate Age in Months
        userAgeMonths = userAgeYears * 12;

        userAgeWeeks = userAgeYears * 52;

//        Calculate Age in Days
        userAgeDays = userAgeYears * 365;

//        Calculate Age in Hours
        userAgeHours = userAgeDays * 24;

//        Calculate Age in Minutes
        userAgeMinutes = userAgeHours * 60;

//        Calculate Age in Seconds
        userAgeSeconds = userAgeMinutes * 60;

//        Calculate Total Heart Beats
        totalHeartBeats = userAgeMinutes * avgHeartBeatsPerMinute;
    }
}
