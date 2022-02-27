import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    public void given_two_identical_words_should_return_true() {
        String word1 = "a";
        String word2 = "a";

        boolean result = anagram.isAnagram(word1, word2);

        Assertions.assertTrue(result);
    }

    @Test
    public void given_two_words_with_different_length_should_return_false() {
        String word1 = "a";
        String word2 = "ab";

        boolean result = anagram.isAnagram(word1, word2);

        Assertions.assertFalse(result);
    }

    @Test
    public void given_two_words_with_same_length_without_contains_same_characters_should_return_false() {
        String word1 = "abcd";
        String word2 = "efgh";

        boolean result = anagram.isAnagram(word1, word2);

        Assertions.assertFalse(result);
    }

    @Test
    public void given_two_words_which_both_contains_same_characters_without_repetition_should_return_true() {
        String word1 = "abcd";
        String word2 = "bcda";

        boolean result = anagram.isAnagram(word1, word2);

        Assertions.assertTrue(result);
    }


    @Test
    public void given_two_words_with_same_characters_but_not_same_occurrences_should_return_false() {
        String word1 = "abcdaa";
        String word2 = "bcdabb";

        boolean result = anagram.isAnagram(word1, word2);

        Assertions.assertFalse(result);
    }
}
