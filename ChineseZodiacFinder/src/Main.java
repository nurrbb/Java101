import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int year,mod;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your birth year: ");
        year = input.nextInt();

        mod = year % 12;

        switch (mod) {
            case 1:
                System.out.println("You born in Rooster year.\nHonest, energetic, intelligent, flamboyant, flexible, diverse.");
                break;
            case 2:
                System.out.println("You born in Dog year. \nLoyal, honest, responsible, courageous, empathetic, sincere.");
                break;
            case 3:
                System.out.println("You born in Pig year. \nHonorable, optimistic, determined, sincere, sociable, tolerant.");
                break;
            case 4:
                System.out.println("You born in Rat year.\nIntelligent, adaptable, quick-witted, charming, artistic, sociable.");
                break;
            case 5:
                System.out.println("You born in Ox year.\nDiligent, dependable, strong, determined, honest, patient.");
                break;
            case 6:
                System.out.println("You born in Tiger year.\nBrave, competitive, unpredictable, confident, passionate, charismatic.");
                break;
            case 7:
                System.out.println("You born in Rabbit year.\nGentle, quiet, elegant, alert, kind, responsible.");
                break;
            case 8:
                System.out.println("You born in Dragon year.\nLucky, flexible, eccentric, imaginative, artistic, charismatic.");
                break;
            case 9:
                System.out.println("You born in Snake year.\nIntuitive, elegant, wise, mysterious, sensual, determined.");
                break;
            case 10:
                System.out.println("You born in Horse year. \nAdventurous, loyal, independent, energetic, optimistic, impulsive.");
                break;
            case 11:
                System.out.println("You born in Goat year.\nCalm, gentle, sympathetic, caring, creative, persevering.");
                break;
            case 0:
                System.out.println("You born in Monkey year.\nSmart, curious, mischievous, innovative, playful, sociable.");
                break;


        }

    }
}