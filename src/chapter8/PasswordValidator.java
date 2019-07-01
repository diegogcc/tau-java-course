package chapter8;

import java.util.Scanner;

/*
Password validator:
- at least 8 characters long
- contain an uppercase letter
- contain a special character
- not contain the username
- not the same as the old password
 */
public class PasswordValidator {

    private static Scanner scanner = new Scanner(System.in);
    private String username;
    private String currentPassword;
    private boolean valid;
    private String errorMessage;

    public PasswordValidator(String username, String currentPassword){
        this.username = username;
        this.currentPassword = currentPassword;
    }

    public static void main(String args[]){

        PasswordValidator validator = login();
        validator.printPasswordRules();
        String proposedPassword;

        do {
            proposedPassword = validator.getProposedPassword();
            validator.changePassword(proposedPassword);
            if (!validator.isValid()){
                System.out.println(validator.getErrorMessage());
            }
        } while (!validator.isValid());

        validator.currentPassword = proposedPassword;
        System.out.println("Your password has been changed to: " + validator.currentPassword);

        validator.closeScanner();
    }

    public void closeScanner() {
        scanner.close();
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void changePassword(String newPassword) {
        valid = true;
        errorMessage = "";

        if (newPassword.length() < 8){
            valid = false;
            errorMessage += "\n Your password must be at least 8 characters long";
        }

        if (newPassword.toLowerCase().equals(newPassword)){
            valid = false;
            errorMessage += "\n Your password must contain at least 1 uppercase letter";
        }

        if (newPassword.matches("[a-zA-Z0-9]*")){
            valid = false;
            errorMessage += "\n Your password must contain at least 1 special character";
        }

        if (newPassword.toUpperCase().contains(username.toUpperCase())){
            valid = false;
            errorMessage += "\n Your password must not contain your username";
        }

        if (newPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\n Your new password can't be equal to your old password";
        }
    }

    public String getProposedPassword() {
        System.out.println("Enter your new password: ");
        return scanner.nextLine();
    }

    public boolean isValid() {
        return valid;
    }

    public void printPasswordRules() {
        System.out.println("Your new password must meet the following requirements: ");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
    }

    public static PasswordValidator login() {
        System.out.println("Enter your username");
        String username = scanner.next();

        System.out.println("Enter your password");
        String password = scanner.next();

        return new PasswordValidator(username, password);
    }
}
