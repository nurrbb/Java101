import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, reset;
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        username = input.nextLine();
        System.out.println("Password: ");
        password = input.nextLine();

        if (username.equals("nur")) {
            if (!password.equals("patika123")) {
                System.out.println("Invalid password! Would you like to reset your password?(Y/N)");
                reset = input.nextLine();
                if (reset.equalsIgnoreCase("Y")) {
                    System.out.println("Please enter the new password:");
                    String newPassword = input.nextLine();
                    System.out.print("Confirm your new password: ");
                    String confirmPassword = input.nextLine();
                    if (newPassword.equalsIgnoreCase("patika123")) {
                        System.out.println("Password cannot be the same as the old password. Please enter a different password.");
                    } else if (!newPassword.equalsIgnoreCase(confirmPassword)) {
                        System.out.println("Passwords do not match. Password reset failed.");

                    } else {
                        System.out.println("Password changed successfully!");
                    }
                } else {
                    System.out.println("Plase try again.");
                }
            } else {
                System.out.println("Login successful.");
            }
        } else {
            System.out.println("Invalid username.");
        }
    }
}