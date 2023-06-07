package exercise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String getForwardedVariables(String cfg) {

        String arr = Stream.of(cfg)
                .map(x -> x.replaceAll("\\[.*", "")
                        .replaceAll("(command.*)", "")
                        .replaceAll("\\n(key.*)", "")
                        .replaceAll("(environment.)", "")
                        .replaceAll("[\\s&\\n]", "")
                        .replaceAll("\"", ","))
                .map(x -> x.split(","))
                .flatMap(Arrays::stream)
                .filter(x -> x.startsWith("X_FORWARDED"))
                .map(x -> x.substring(12).concat(","))
                .collect(Collectors.joining());
        return arr.substring(0, arr.length() - 1);
    }
}
//END
