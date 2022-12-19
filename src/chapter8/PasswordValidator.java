package chapter8;

import java.util.Arrays;

/*
    8 Character Longs
    Contain a Uppercase letter
    Contain a Special Character
    Not contain the username
    Not the same old password
     */
public class PasswordValidator {

    private static String userName;
    public static String newPassword;
    private static String oldPassword;
    private static char[] Special_Character = new char[11];

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

    public static char[] special_Characters(){
        Special_Character[0] = '!';
        Special_Character[1] = '"';
        Special_Character[2] = '#';
        Special_Character[3] = '$';
        Special_Character[4] = '%';
        Special_Character[5] = '&';
        Special_Character[6] = '(';
        Special_Character[7] = ')';
        Special_Character[8] = '*';
        Special_Character[9] = '+';
        Special_Character[10] = '-';
        return Special_Character;

    }

    public static boolean usernameChecker(){

        if(newPassword.contains(userName)){
            return false;
        }
        return true;
    }
    public static boolean uppercaseChecker(){
        var modifiedText = new StringBuilder(newPassword);
        for(int i =0; i<= modifiedText.length(); i++){
            if(Character.isUpperCase(modifiedText.charAt(i))){
                return true;
            }

        }
        return false;
    }
    public static char[] string2Char(){
        char[] charPassword = new char[newPassword.length()];
        for(int i=0; i<=newPassword.length();i++){
            charPassword[i] = newPassword.charAt(i);
        }
        return charPassword;
    }
    public static boolean specialCharacterChecker(){
        char[] string2Char = string2Char();
        char[] special = special_Characters();
        for (int i = 0;i <= newPassword.length(); i++){
            if(string2Char[i] == special[i]){
                return true;
            }
        }
        return false;
    }

    public static void changePassword(){
        boolean upperCase = uppercaseChecker();
        boolean specialCase = specialCharacterChecker();
        boolean userName = usernameChecker();
        int passwordLength = newPassword.length();
        if (passwordLength > 8 && newPassword.equals(oldPassword) && upperCase && specialCase && userName){
            oldPassword = newPassword;
            System.out.println("You changed your password successful.");
        }else if(upperCase == false){
            System.out.println("You didn't entered any UpperCase character on your password.");
        }else if(specialCase == false){
            System.out.println("You didn't entered any Special character on your password.");
        }else if(userName == false){
            System.out.println("You entered your username in password.");
        }
    }


}
