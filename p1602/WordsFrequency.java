package algorithm.p1602;

import java.util.HashMap;
import java.util.Map;

public class WordsFrequency {
    Map<String, Integer> map = new HashMap<>();

    public WordsFrequency(String[] book) {
        for (String s : book) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
    }

    public int get(String word) {
        return map.getOrDefault(word, 0);
    }
}
