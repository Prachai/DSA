import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Practise
{	
    private static final int MIN_USERNAME_LENGTH = 5;
    private static final int MAX_USERNAME_LENGTH = 10;
    
    private static final int MIN_PASSWORD_LENGTH = 8;
    private static final int MAX_PASSWORD_LENGTH = 15;

    private static final String ALLOWED_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static void main(String[] args) {
        List<String> validUsernames = generateValidUsernames(5);
        List<String> validPasswords = generateValidPasswords(5);

        List<String> invalidUsernames = generateInvalidUsernames(5);
        List<String> invalidPasswords = generateInvalidPasswords(5);

        System.out.println("Valid Usernames: " + validUsernames);
        System.out.println("Valid Passwords: " + validPasswords);

        System.out.println("Invalid Usernames: " + invalidUsernames);
        System.out.println("Invalid Passwords: " + invalidPasswords);
    }

    public static List<String> generateValidUsernames(int numSamples) {
        List<String> usernames = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numSamples; i++) {
            StringBuilder sb = new StringBuilder();
            int usernameLength = random.nextInt(MAX_USERNAME_LENGTH - MIN_USERNAME_LENGTH + 1) + MIN_USERNAME_LENGTH;

            for (int j = 0; j < usernameLength; j++) {
                char randomChar = ALLOWED_CHARACTERS.charAt(random.nextInt(ALLOWED_CHARACTERS.length()));
                sb.append(randomChar);
            }

            usernames.add(sb.toString());
        }

        return usernames;
    }

    public static List<String> generateValidPasswords(int numSamples) {
        List<String> passwords = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numSamples; i++) {
            StringBuilder sb = new StringBuilder();
            int passwordLength = random.nextInt(MAX_PASSWORD_LENGTH - MIN_PASSWORD_LENGTH + 1) + MIN_PASSWORD_LENGTH;

            for (int j = 0; j < passwordLength; j++) {
                char randomChar = ALLOWED_CHARACTERS.charAt(random.nextInt(ALLOWED_CHARACTERS.length()));
                sb.append(randomChar);
            }

            passwords.add(sb.toString());
        }

        return passwords;
    }

    public static List<String> generateInvalidUsernames(int numSamples) {
        List<String> invalidUsernames = new ArrayList<>();
        invalidUsernames.add("");
        invalidUsernames.add("short");
        invalidUsernames.add("waytoolongusername");
        invalidUsernames.add("username$!@");
        invalidUsernames.add("   spaces   ");

        return invalidUsernames;
    }

    public static List<String> generateInvalidPasswords(int numSamples) {
        List<String> invalidPasswords = new ArrayList<>();
        invalidPasswords.add("");
        invalidPasswords.add("short");
        invalidPasswords.add("waytoolongpassword");
        invalidPasswords.add("password$!@");
        invalidPasswords.add("   spaces   ");

        return invalidPasswords;
    }

	


}