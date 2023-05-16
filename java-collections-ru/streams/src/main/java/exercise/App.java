package exercise;

import org.apache.commons.lang3.StringUtils;
import java.util.List;

// BEGIN
class App {
    public static Long getCountOfFreeEmails(List<String> emails) {

        List<String> freeDomains = List.of("gmail.com", "yandex.ru", "hotmail.com");
        return emails.stream()
                .filter(StringUtils::isNotBlank)
                .map(y -> y.substring(y.indexOf("@") + 1))
                .filter(x -> x.equals(freeDomains.get(0)) || x.equals(freeDomains.get(1)) || x.equals(freeDomains.get(2)))
                .count();
    }
}
// END
