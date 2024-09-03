package Class_Method_Lab;

public class ClassMethodLab{
    public static void main(String[] args)
    {
        String str = "Hello"; // sets str to a string with both capital and lowercase characters
        System.out.println(str);
        System.out.println(CaseChange.allUpper(str)); // tests the allUpper method converting str to all uppercase
        System.out.println(CaseChange.allLower(str)); // tests the allLower method converting str to all lowercase
        double milli_to_centi=PrefixConvert.prefix_convert("milli",50,"centi"); // tests small prefixes to large prefixes
        double kilo_to_milli = PrefixConvert.prefix_convert("kilo",3,"MILLI"); // tests large prefixes to small prefixes as well as input standardization
        System.out.println("50 millimeters is "+milli_to_centi+" centimeters");
        System.out.println("3 kilograms is "+kilo_to_milli+" milligrams"); 
        
    }
}