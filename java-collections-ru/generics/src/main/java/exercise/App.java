package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> listBooks, Map<String, String> dictionary) {

        List <Map<String, String>> listBooksNew = new ArrayList<>();
        for (Map<String, String> dict: listBooks) {
            if (dict.entrySet().containsAll(dictionary.entrySet())) {
                listBooksNew.add(dict);
            }
        }
        return listBooksNew;
    }
}
//END
