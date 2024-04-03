import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int calculus, physics, chemistry, english, average;
        int numOfCourses = 0;
        int total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter calculus grade: ");
        calculus = input.nextInt();
        if (1 <= calculus && calculus <= 99) {
            total += calculus;
            numOfCourses++;
        }

        System.out.print("Please enter physics grade: ");
        physics = input.nextInt();
        if (1 <= physics && physics <= 99) {
            total += physics;
            numOfCourses++;
        }

        System.out.print("Please enter chemistry grade: ");
        chemistry = input.nextInt();
        if (1 <= chemistry && chemistry <= 99) {
            total += chemistry;
            numOfCourses++;
        }

        System.out.print("Please enter english grade: ");
        english = input.nextInt();
        if (1 <= english && english <= 99) {
            total += english;
            numOfCourses++;
        }

        if (numOfCourses > 0) {
            average = total / numOfCourses;
            if (average<55)
            {
                System.out.print("Failed. Average grade:"+ average);
            }
            else
            {
                System.out.print("Passed. Average grade: " + average);
            }
        } else {
            System.out.println("No valid grades entered.");
        }
    }
}
