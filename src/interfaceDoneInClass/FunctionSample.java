package interfaceDoneInClass;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionSample {

    public static void main(String[] args) {
        Function<String, String[]> function = (word)-> {
            String[] letters = new String[word.length()];
            for(int count = 0; count < word.length(); count++) {
                letters[count] = String.valueOf(word.charAt(count));
            }
            return letters;
        };

        System.out.println(Arrays.toString(function.apply("John Doe")));
    }
}
