import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        int total = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        num = input.nextInt();

        for (int i=0; i<=num ; i++){
            if(i%3==0 && i%4==0)
            {
                total +=i;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) total / count;
            System.out.println("Average of numbers divisible by both 3 and 4 from 0 to " + num + ": " + average);
        } else {
            System.out.println("No numbers divisible by both 3 and 4 from 0 to " + num + " found.");
        }
    }
}