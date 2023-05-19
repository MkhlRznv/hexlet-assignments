package exercise;

import java.util.*;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        List<String> mens = users.stream()
                .filter(Objects::nonNull)
                .filter(x -> x.get("gender").equals("male"))
                .sorted(Comparator.comparing(x -> x.get("birthday")))
                .map(c -> c.get("name"))
                .toList();

        return mens;
    }
}

// END
