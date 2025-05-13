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

//        Calculate Months
        userAgeMonths = userAgeYears * 12;

        userAgeWeeks = userAgeYears * 52;

//        Calculate Days
        userAgeDays = userAgeYears * 365;

    }
}
