import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of elements: ");
        int n= input.nextInt();
        System.out.print("Enter the number of elements to form the combination: ");
        int m = input.nextInt();
        int total = 1;
        int total2 = 1;
        int total3 = 1;
        int result;
        int l;

       while (m>=n){
           System.out.println("The number of elements to form the combination cannot be greater than the total! Please enter again.");
           System.out.print("Enter the number of elements to form the combination: ");
           m = input.nextInt();
       }
       l=n-m;
       for (int i=1; i<=n; i++){
           total = total*i;
       }
       for (int i=1; i<=m; i++){
            total2 = total2*i;
       }
       for (int i=1; i<=l; i++){
            total3 = total3*i;
       }
        result= total /(total2*total3);
        System.out.println("C("+n+","+m+")="+result);




    }
}