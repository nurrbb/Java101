import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1,num2,select;
        double result;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: " );
        num1=input.nextInt();
        System.out.print("Enter the second number: ");
        num2=input.nextInt();

        System.out.println("Enter the number of the operation you want to perform\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        select = input.nextInt();

        switch (select){
            case 1:
               result = num1+num2;
               System.out.println(num1+"+"+num2+"="+result);
                break;
            case 2:
                result=num1-num2;
                System.out.println(num1+"-"+num2+"="+result);
                break;
            case 3:
                result=num1*num2;
                System.out.println(num1+"*"+num2+"="+result);
                break;
            case 4:
                result = (double) num1 /num2;
                String format = String.format("%.2f",result);
                System.out.println(num1+"/"+num2+"="+format);
                break;
            default:
                System.out.println("Please enter valid option.");
                break;
        }
    }
}