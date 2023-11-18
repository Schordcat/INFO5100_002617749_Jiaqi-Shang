import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexPatternDemo {

    public static void main(String[] args) {
        // Define test cases for each regular expression pattern
        String[][] testCases = {
            {"^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$", "john.doe@example.com", "john.doe@"}, // Email Address
            {"^\\(?([0-9]{3})\\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$", "800-555-1234", "55-1234"}, // U.S. Phone Number
            {"^\\d{4}-\\d{2}-\\d{2}$", "2023-03-14", "14/03/2023"}, // Date in YYYY-MM-DD
            {"^([0-9]{1,3}\\.){3}[0-9]{1,3}$", "192.168.0.1", "999.999.999.999"}, // IPv4 Address
            {"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$", "Secure123", "short1"} // Password
        };

        // Process each test case
        for (String[] testCase : testCases) {
            String pattern = testCase[0];
            String positiveTest = testCase[1];
            String negativeTest = testCase[2];

            System.out.println("Testing Pattern: " + pattern);
            testPattern(pattern, positiveTest, true);
            testPattern(pattern, negativeTest, false);
        }
    }

    private static void testPattern(String pattern, String testString, boolean shouldBePositive) {
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(testString);
        boolean matches = matcher.matches();

        System.out.println("  Test String: \"" + testString + "\" - " + (matches ? "Matches" : "Does not match"));
        if (matches != shouldBePositive) {
            System.out.println("    Error: Test case did not meet expected result.");
        }
    }
}
