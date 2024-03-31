import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int math,physic,chemistry,turkish,history,music;
        Scanner sc = new Scanner(System.in);
        System.out.print("Math Grade: ");
        math = sc.nextInt();

        System.out.print("Physic Grade: ");
        physic = sc.nextInt();

        System.out.print("Chemistry Grade: ");
        chemistry=sc.nextInt();

        System.out.print("Turkish Grade: ");
        turkish=sc.nextInt();

        System.out.print("History Grade: ");
        history=sc.nextInt();

        System.out.print("Music Grade: ");
        music=sc.nextInt();

        int total = (math+physic+chemistry+turkish+history+music);
        double result = total/6.0;
        System.out.println( result>60 ? "Passed by "+result : "Failed by "+result);

    }
}