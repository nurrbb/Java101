import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int[] list= {15,12,788,1,-1,-778,2,0};
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < num && i > min) {
                min = i;
            } else if (i > num && i < max) {
                max = i;
            }
        }
        System.out.println("Nearest number smaller than the entered number: " + min);
        System.out.println("Nearest number larger than the entered number: " + max);

    }
}