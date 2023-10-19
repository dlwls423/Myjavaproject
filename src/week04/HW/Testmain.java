package week04.HW;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testmain {
    public static void main(String[] args) {
        String[] expressions = {"1", "9", "10", "5+", "9+", "5++", "9++", "5+++", "9+++"};

// Regular expression: [0-9]+
        String regex = "[0-9]+";

        for (String expression : expressions) {
            boolean matchesRegex = Pattern.matches(regex, expression);

            System.out.println("Expression: " + expression);
            System.out.println("Regex (matches [0-9]+): " + matchesRegex);
            System.out.println();
        }
    }
}
