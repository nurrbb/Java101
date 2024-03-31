import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double price,tax,total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter price: ");
        price = sc.nextDouble();

        if( price<=1000 ){
            tax = (price*18)/100;
            total=tax+price;
            System.out.print("Price: "+price+"\n"+"Tax: "+tax+ "\n"+"Include Tax: "+ total );
        }
        else {
            tax = (price*8)/100;
            total=tax+price;
            System.out.print("Price:"+price+"\n"+"Tax:"+tax+ "\n"+"Include Tax: "+ total );
        }
    }
}