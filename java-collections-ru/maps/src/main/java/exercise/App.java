package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String str) {
        Map<String, Integer> dictionary = new HashMap<>();

        if (str.equals("")) {
            return dictionary;
        }

        String[] words = str.split(" ");
        int i = 1;
        for (String w: words) {
            if (dictionary.containsKey(w)) {
                dictionary.replace(w, i++);
            } else {
                dictionary.put(w, 1);
            }
        }
        return dictionary;
    }

    public static String toString(Map<String, Integer> dictionary) {
        if (dictionary.isEmpty()) {
            return "{}";
        }

        StringBuilder s = new StringBuilder("{");
        for (Map.Entry<String, Integer> entry: dictionary.entrySet()) {
            s.append("\n  ").append(entry.getKey()).append(": ").append(entry.getValue());
        }
        s.append("\n}");
        return s.toString();
    }
}
//END
