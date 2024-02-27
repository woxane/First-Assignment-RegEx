import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {

    public static String extractURL(String text) {

        String regex = "(http|https)://(www.)?[a-zA-Z0-9@:%._-]{2,256}\\.[a-zA-Z]{2,6}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }
        else{
            return null;
        }
    }


    public static boolean validateEmail(String email) {
        String regex = "^[^\\s\\.@]+@[^\\s\\.@]+\\.[^\\s\\.@]{2,3}$";
        return email.matches(regex);
    }


    public static List<String> findWordsWithRepeatLetters(String input) {
        List<String> wordsWithRepeatLetters = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b\\w*(\\w)\\w*\\1\\w*\\b");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            wordsWithRepeatLetters.add(matcher.group());
        }

        return wordsWithRepeatLetters;
    }

    /*
    Bonus Problem ;)
    implement the method below so that it returns a list of words that are repeated twice accidentally in a string
    for example: "appleapple orange pearpear pineapple" -> ["appleapple", "pearpear"]
    */

    public static List<String> findReapetdWords(String input) {
        List<String> repeatedWords = new ArrayList<>();
        return repeatedWords;
    }

    public static void main(String[] args) {
         // Test extractURL
         String text = "Visit my website at https://www.example.com for more information.";
         System.out.println("URL: " + extractURL(text));
 
         // Test validateEmail
         String email = "test@example.com";
         System.out.println("Is Email Valid: " + validateEmail(email));
 
         // Test findWordsWithRepeatLetters
         String input = "apple banana hello";
         System.out.println("Words with Repeated Letters: " + findWordsWithRepeatLetters(input));
     }
}
