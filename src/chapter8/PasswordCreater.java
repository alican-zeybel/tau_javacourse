package chapter8;

import java.util.Scanner;

public class PasswordCreater {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        PasswordValidator passwordValidator = new PasswordValidator();
        System.out.println("Password changer");
        System.out.println("Please enter your username.");
        String userName = scanner.nextLine();
        passwordValidator.setNewPassword(userName);
        System.out.println("Please enter your old password.");
        String oldPassword = scanner.nextLine();
        passwordValidator.setOldPassword(oldPassword);
        System.out.println("Please enter your new password.");
        String newPassword = scanner.nextLine();
        passwordValidator.setNewPassword(newPassword);
        PasswordValidator.changePassword();
        String errorMessage = PasswordValidator.errorMessage;
        System.out.println(errorMessage);
    }

}