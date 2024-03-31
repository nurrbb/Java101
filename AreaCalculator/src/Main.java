import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x,y,z,u;
        double total;
        Scanner  input = new Scanner(System.in);
        System.out.println("Please enter the measurements of the 3 sides of the triangle");
        x =input.nextInt();
        y =input.nextInt();
        z =input.nextInt();

        u = (x+y+z)/2;
        total=Math.sqrt(u*(u-x)*(u-y)*(u-z));
        System.out.println("Measurments:"+x+","+y+","+z+"\n"+"Area of triangle:"+total );

    }
}