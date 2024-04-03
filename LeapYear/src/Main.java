import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year,mod,mod2;
        System.out.print("Please enter year: ");
        year=input.nextInt();
        mod= year%4;
        mod2=year%400;

        if(mod==0){
            System.out.println(year+ " is a leap year.");
        }
        else if (mod2==0){
            System.out.println(year+" is a leap year.");

        }
        else {
            System.out.println(year+" is not a leap year.");
        }
    }
}