// this program computes the summation of individual digits within a given numerical input.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Please enter a number to calculate the sum of its digits: ");
        int num=input.nextInt();

        int tempNumber=num;
        int digitValue;
        int totalDigitValue=0;

        while (tempNumber!=0){
            tempNumber/=10;

        }
        tempNumber=num;
        while (tempNumber!=0){
            digitValue=tempNumber%10;
            tempNumber/=10;
            totalDigitValue+=digitValue;
        }
        System.out.println();
        System.out.print("Total Digit Value= "+totalDigitValue);

    }
}