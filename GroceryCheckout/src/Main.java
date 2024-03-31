import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double apple,banana,pear,tomato,eggplant,onion,total;
        double applePerKg = 2.32;
        double bananaPerKg = 4.24;
        double pearPerKg = 6.12;
        double tomatoPerKg = 2.31;
        double eggplantPerKg = 6.97;
        double onionPerKg = 2.83;

        Scanner input = new Scanner(System.in);
        System.out.println("How many kilos of apple?");
        apple = input.nextDouble();

        System.out.println("How many kilos of banana?");
        banana = input.nextDouble();

        System.out.println("How many kilos of pear?");
        pear = input.nextDouble();

        System.out.println("How many kilos of tomato?");
        tomato = input.nextDouble();

        System.out.println("How many kilos of eggplant?");
        eggplant = input.nextDouble();

        System.out.println("How many kilos of onion?");
        onion = input.nextDouble();

        total = (apple*applePerKg)+(banana*bananaPerKg)+(pear*pearPerKg)+(tomato*tomatoPerKg)+(eggplant*eggplantPerKg)+(onionPerKg*onion);
        System.out.println("Total: " +total + "TL");
    }
    }
