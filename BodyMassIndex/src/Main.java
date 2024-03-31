import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double weight,height,index;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height (in meters): ");
        height = input.nextDouble();
        System.out.print("Please enter your weight (in kg): ");
        weight=input.nextDouble();
        index = (weight/(height*height));
        System.out.print("Your body mass index: "+index);



    }
}