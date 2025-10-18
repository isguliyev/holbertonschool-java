import java.util.TreeMap;

public class PhraseAnalyzer {
    public static TreeMap<String, Integer> wordCount(String text) {
        TreeMap<String, Integer> frequency = new TreeMap<String, Integer>();

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