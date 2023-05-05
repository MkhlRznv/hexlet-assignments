package exercise;

import java.util.*;

// BEGIN
class App {
    public static boolean scrabble(String simbol, String str) {

        if (simbol.length() < str.length()) {
            return false;
        }
        List<String> strList = new ArrayList<>(Arrays.asList(str.toLowerCase().split("")));
        List<String> simbolList = new ArrayList<>(Arrays.asList(simbol.toLowerCase().split("")));

        for (String i: strList) {
            if (!simbolList.contains(i)) {
                return false;
            }
            simbolList.remove(i);
        }
        return true;
    }
}
//END
