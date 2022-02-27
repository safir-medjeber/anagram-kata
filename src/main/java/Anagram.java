import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {

    public boolean isAnagram(String word1, String word2) {
        return !areDifferentLength(word1, word2) && areSameWordAfterAlphabeticalReordering(word1, word2);
    }

    private boolean areDifferentLength(String word1, String word2) {
        return word1.length() != word2.length();
    }

    private boolean areSameWordAfterAlphabeticalReordering(String word1, String word2) {
        String word1splitSorted = Arrays.stream(word1.split("")).sorted().collect(Collectors.joining());
        String word2splitSorted = Arrays.stream(word2.split("")).sorted().collect(Collectors.joining());
        return word1splitSorted.equals(word2splitSorted);
    }
}
