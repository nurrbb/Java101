import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Element: ");
            array[i] = input.nextInt();
        }

        System.out.println("The array you entered is:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        Arrays.sort(array);

        System.out.println("\nThe array sorted in ascending order is:");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}