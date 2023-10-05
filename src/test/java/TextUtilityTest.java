import org.example.TextUtility;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TextUtilityTest {

    @ParameterizedTest
    @ValueSource(strings={"Madam", "mom", "nun","Sir, I demand, I am a maid named Iris."})
    public void isPalindromeTest(String words){

        TextUtility text = new TextUtility(words);

        assertEquals(true, text.isPalindrome(words));

    }

    @ParameterizedTest
    @ValueSource(strings={"hej", "blabla", "upp"})
    public void isNotPalindromeTest(String words){

        TextUtility text = new TextUtility(words);

        assertEquals(false, text.isPalindrome(words));

    }
}
