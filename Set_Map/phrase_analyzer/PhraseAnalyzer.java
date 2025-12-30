import java.util.TreeMap;
import java.util.Map;

public class PhraseAnalyzer {
    public static Map<String, Integer> wordCount(String text) {
        Map<String, Integer> frequency = new TreeMap<String, Integer>();

        if (text == null || text.isEmpty()) {
            return frequency;
        }

        for (String word : text.toLowerCase().split("[\\s,.?!]+")) {
            if (word.isEmpty()) {
                continue;
            }

            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        return frequency;
    }
}