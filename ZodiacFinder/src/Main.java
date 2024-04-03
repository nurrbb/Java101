import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month, day;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of the month you were born. ");
        System.out.println("1-January\n2-February\n3-March\n4-April\n5-May\n6-June\n7-July \n8-August\n9-September\n10-October\n11-November\n12-December");

        month = input.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid value.");
        }

        System.out.println("Please enter the number of the day you were born. ");

        day = input.nextInt();
        if (day < 1 || day > 31) {
            System.out.println("Invalid value.");
        }

        if (month == 1) {
            if (day > 0 && day < 22) {
                System.out.println("You are a Capricorn.");
            } else {
                System.out.println("You are a Aquarius .");
            }
        }
        if (month == 2) {
            if (day > 0 && day < 20) {
                System.out.println("You are a Aquarius .");
            } else {
                System.out.println("You are a Pisces.");
            }
        }
        if (month == 3) {
            if (day > 0 && day < 21) {
                System.out.println("You are a Pisces .");
            } else {
                System.out.println("You are a Aries.");
            }
        }
        if (month == 4) {
            if (day > 0 && day < 21) {
                System.out.println("You are a Aries .");
            } else {
                System.out.println("You are a Taurus .");
            }
        }
        if (month == 5) {
            if (day > 0 && day < 22) {
                System.out.println("You are a Taurus.");
            } else {
                System.out.println("You are a Gemini.");
            }
        }
        if (month == 6) {
            if (day > 0 && day < 23) {
                System.out.println("You are a Gemini.");
            } else {
                System.out.println("You are a Cancer.");
            }
        }
        if (month == 7) {
            if (day > 0 && day < 24) {
                System.out.println("You are a Cancer.");
            } else {
                System.out.println("You are a Leo.");
            }
        }
        if (month == 8) {
            if (day > 0 && day < 24) {
                System.out.println("You are a Leo.");
            } else {
                System.out.println("You are a Virgo.");
            }
        }
        if (month == 9) {
            if (day > 0 && day < 23) {
                System.out.println("You are a Virgo.");
            } else {
                System.out.println("You are a Libra.");
            }
        }
        if (month == 10) {
            if (day > 0 && day < 24) {
                System.out.println("You are a Libra.");
            } else {
                System.out.println("You are a Scorpio.");
            }
        }
        if (month == 11) {
            if (day > 0 && day < 24) {
                System.out.println("You are a Scorpio.");
            } else {
                System.out.println("You are a Sagittarius.");
            }
        }
        if (month == 12) {
            if (day > 0 && day < 22) {
                System.out.println("You are a Sagittarius.");
            } else {
                System.out.println("You are a Capricorn.");
            }
        }
    }
}