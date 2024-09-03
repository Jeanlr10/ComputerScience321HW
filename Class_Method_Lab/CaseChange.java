package Class_Method_Lab;

// I am aware that there is already a method doing what this is meant to do, but i wanted to practice looping through strings
public class CaseChange {

    // Method to convert all lowercase letters in the input string to uppercase
    public static String allUpper(String input) {
        String output = ""; // Initialize an empty output string
        
        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            // If the character is lowercase, convert it to uppercase
            if (Character.isLowerCase(input.charAt(i))) {
                output = output + Character.toUpperCase(input.charAt(i));
            } else {
                // If the character is not lowercase, add it to the output string as is
                output = output + input.charAt(i);
            }
        }
        return output; // Return the resulting string with all lowercase letters converted to uppercase
    }

    // Method to convert all uppercase letters in the input string to lowercase
    public static String allLower(String input) {
        String output = ""; // Initialize an empty output string
        
        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            // If the character is uppercase, convert it to lowercase
            if (Character.isUpperCase(input.charAt(i))) {
                output = output + Character.toLowerCase(input.charAt(i));
            } else {
                // If the character is not uppercase, add it to the output string as is
                output = output + input.charAt(i);
            }
        }
        return output; // Return the resulting string with all uppercase letters converted to lowercase
    }
}
