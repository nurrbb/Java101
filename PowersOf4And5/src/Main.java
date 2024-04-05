import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number for the limit: ");
        num=input.nextInt();
        System.out.println("Powers of 4 until "+num+ ":" );
        for (int i =1; i<=num; i*=4){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Powers of 5 until "+num+ ":" );
        for (int i =1; i<=num; i*=5){
            System.out.print(i+" ");
        }
        System.out.println();


    }
}