import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {

    public boolean isAnagram(String word1, String word2) {
        return !areDifferentLength(word1, word2) && areSameWordAfterAlphabeticallyReordered(word1, word2);
    }

    private boolean areDifferentLength(String word1, String word2) {
        return word1.length() != word2.length();
    }

    private boolean areSameWordAfterAlphabeticallyReordered(String word1, String word2) {
        String word1AlphabeticallyReordered = Arrays.stream(word1.split("")).sorted().collect(Collectors.joining());
        String word2AlphabeticallyReordered = Arrays.stream(word2.split("")).sorted().collect(Collectors.joining());
        return word1AlphabeticallyReordered.equals(word2AlphabeticallyReordered);
    }
}
