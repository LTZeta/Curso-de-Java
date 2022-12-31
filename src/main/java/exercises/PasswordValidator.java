package exercises;

/*
 * At least 8 characters long
 * contain an uppercase letter
 * contain a special character
 * not contain the username
 * not the same as the old password
 */

import java.util.Scanner;

public class PasswordValidator {

    private String username;
    private String currentPassword;

    private boolean valid;
    private String errorMessage;

    private final byte REQUIREDLENGTH=8;

    private static Scanner scanner = new Scanner(System.in);

    public PasswordValidator(String username, String currentPassword){
        this.username = username;
        this.currentPassword = currentPassword;
    }

    public boolean isValid(){
        return valid;
    }

    public String getErrorMessage(){
        return errorMessage;
    }

    public void closeScanner(){
        scanner.close();
    }

    public static void main(String args[]){
        var validator = login();
        validator.printPasswordRules();

        do {
            var proposedPassword = validator.getProposedPassword();
            validator.changePassword(proposedPassword);

            if(!validator.isValid()){
                System.out.println(validator.getErrorMessage());
            }
        }while(!validator.isValid());

        System.out.println("The proposed password is valid");

        validator.closeScanner();
    }

    public static PasswordValidator login(){
        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        return new PasswordValidator(username, password);
    }

    public void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    public String getProposedPassword(){
        System.out.println("Enter your new password:");
        return scanner.nextLine();
    }

    public void changePassword(String newPassword){

        valid=true;
        errorMessage="";

        if (newPassword.length() < REQUIREDLENGTH){
            valid=false;
            errorMessage="\n Your password must be at least 8 characters.";
            return;
        }

        if(newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Your password must include an uppercase letter.";
            return;
        }

        if (newPassword.matches("[a-zA-Z0-9 ]*")){
            valid=false;
            errorMessage="\n Your password must be at least 1 special character";
            return;
        }

        if (newPassword.toUpperCase().contains(username.toUpperCase())){
            valid=false;
            errorMessage="\n Your password cannot contain your username";
            return;
        }

        if (newPassword.equals(currentPassword)){
            valid=false;
            errorMessage="\n Your password cannot be same as the current password";
        }

    }

}

