package chapter8;

import java.util.Arrays;


public class PasswordValidator {

    private static String userName;
    public static String newPassword;
    private static String oldPassword;
    public static String errorMessage;

     PasswordValidator(){
        userName = "";
    }
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }



    public static boolean uppercaseChecker(){
        char[] string2Char = newPassword.toCharArray();
        for (int i = 0; i < string2Char.length; i++) {
            if (Character.isUpperCase(string2Char[i])){
                return true;
            }
        }
        return false;
    }

    public static boolean specialCharacterChecker(){
        if(!(newPassword.matches("[a-zA-Z0-9 ]*"))){
            return true;
        }else{
            return false;
        }
    }

    public static boolean lengthChecker(){
        if(newPassword.length() > 8) {
            return true;
        }else{
            return false;
        }
    }

    public static String getErrorMessage(){
        return errorMessage;
    }

    public static void changePassword(){
        boolean upperCase = uppercaseChecker();
        boolean specialCase = specialCharacterChecker();
        boolean lengthOld_New = lengthChecker();

        if (upperCase && specialCase && lengthOld_New){
            oldPassword = newPassword;
            System.out.println("You changed your password successfully.");
        }else if(!(upperCase)){
            errorMessage += "\n Your password need contain uppercase.";
        }else if(!(specialCase)){
            errorMessage += " \n Your password need contain special characters.";
        }else if(!(lengthOld_New)){
            errorMessage += "\n Your password length lower than 8.";
        }
    }


}
