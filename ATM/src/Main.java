import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userName, password;
        int balance = 2500;
        int attempt = 3;


        while (attempt > 0) {
            System.out.print("Please enter your username: ");
            userName = input.nextLine();
            System.out.print("Please enter your password: ");
            password = input.nextLine();
            if (userName.equals("user79") && password.equals("abc123")) {
                System.out.println("Login successfully.");
                while (true ){

                    System.out.println("Press 1 for Check balance");
                    System.out.println("Press 2 for Withdraw Money");
                    System.out.println("Press 3 for Deposit Money");
                    System.out.println("Press 4 for Exit");

                    System.out.print("Choise: ");
                  int  choise = input.nextInt();
                    input.nextLine();




                    switch (choise){
                        case 1:
                            System.out.println("Current balance: "+balance);
                            break;
                        case 2:
                            System.out.print("Please enter the amount of money you want to withdraw:");
                            int amount = input.nextInt();
                            if (balance>amount) {
                                balance -=amount;
                                System.out.println("Your remaining balance: "+balance);
                            }
                            else {
                                System.out.println("insufficient balance!");
                            }
                            break;
                        case 3:
                            System.out.print("Please enter the amount of money you want to deposit:");
                             amount=input.nextInt();
                             balance +=amount;
                             break;
                        case 4:
                            System.out.println("Have a nice day!");
                        return;

                    }
                }
            } else {
                attempt--;
                System.out.println("Incorrect username or password.Please try again.");
                if (attempt == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank customer service.");
                } else {
                    System.out.println("Remaining attempt:" + attempt);
                }
            }
        }

    }
}