package com.gla.methods.level3;

import java.util.Scanner;

public class CalendarDisplay {

    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        if (month >= 1 && month <= 12) {
            return months[month - 1];
        }
        return "Invalid Month";
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    public static int getFirstDayOfMonth(int month, int year) {
        // Zeller's Congruence algorithm for Gregorian calendar
        int m = month;
        int y = year;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int K = y % 100;
        int J = y / 100;
        int h = (1 + (13 * (m + 1)) / 5 + K + K/4 + J/4 + 5*J) % 7;
        // Zeller returns 0 = Saturday, 1 = Sunday, ..., 6 = Friday
        // We need 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        int dayOfWeek = (h + 6) % 7;
        return dayOfWeek;
    }

    public static void displayCalendar(int month, int year) {
        System.out.println("       " + getMonthName(month) + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int days = getDaysInMonth(month, year);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // 4 spaces for indentation
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%4d", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println(); // move to next line after Saturday
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);

        sc.close();
    }
}

