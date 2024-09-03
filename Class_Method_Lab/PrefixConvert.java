package Class_Method_Lab;
import java.util.HashMap;

public class PrefixConvert {

    // Method to get the exponent value associated with a given metric prefix
    public static int prefixes(String input) {
        // Create a HashMap to store metric prefixes and their corresponding exponent values
        HashMap<String, Integer> prefixMap = new HashMap<>(); 
        
        // Populate the HashMap with metric prefixes and their exponent values
        prefixMap.put("quetta", 30);
        prefixMap.put("ronna", 28);
        prefixMap.put("yotta", 24);
        prefixMap.put("zetta", 21);
        prefixMap.put("exa", 18);
        prefixMap.put("peta", 15);
        prefixMap.put("tera", 12);
        prefixMap.put("giga", 9);
        prefixMap.put("mega", 6);
        prefixMap.put("kilo", 3);
        prefixMap.put("hecto", 2);
        prefixMap.put("deca", 1);
        prefixMap.put("deci", -1);
        prefixMap.put("centi", -2);
        prefixMap.put("milli", -3);
        prefixMap.put("micro", -6);
        prefixMap.put("nano", -9);
        prefixMap.put("pico", -12);
        prefixMap.put("femto", -15);
        prefixMap.put("atto", -18);
        prefixMap.put("zepto", -21);
        prefixMap.put("yocto", -24);
        prefixMap.put("ronto", -27);
        prefixMap.put("quecto", -30);

        // Return the exponent value associated with the input prefix
        return prefixMap.get(input);
    }

    // Method to convert a number from one metric prefix to another
    public static double prefix_convert(String input_prefix, double number, String output_prefix) {
        // Get the exponent value for the input prefix (case-insensitive)
        int decimalnormalize_input = prefixes(CaseChange.allLower(input_prefix));
        
        // Get the exponent value for the output prefix (case-insensitive)
        int decimalnormalize_output = prefixes(CaseChange.allLower(output_prefix));
        
        // Calculate the difference between the input and output exponents
        double decimalnormalized = decimalnormalize_input - decimalnormalize_output;
        
        // Convert the number by multiplying it with 10 raised to the power of the exponent difference
        double output = number * Math.pow(10, decimalnormalized); 
        
        // Return the result, rounded to the nearest whole number
        return Math.round(output);
    }    
}
