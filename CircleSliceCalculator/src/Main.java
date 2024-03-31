import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r,a;
        double area, pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter radius: ");
        r = input.nextInt();
        System.out.print("Please enter central angle of the area to be calculated: ");
        a=input.nextInt();
        area = (pi*(r*r)*a)/360;
        System.out.println("Area of "+a+" angle: "+area);
        }
    }
