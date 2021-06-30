import java.util.*;
import java.util.stream.Collectors;

public class StringCollection {
    public static void main(String[] args) {
        System.out.println(getWordsAsList("She sells sea shells on the Sea shore"));
    }

    public static Map<String, Integer> getWordsAsList(String sentence) {
        List<String> words = Arrays.asList(sentence.split(" "));
        return words.stream()
                .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
    }
}
