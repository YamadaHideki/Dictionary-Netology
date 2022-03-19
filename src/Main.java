import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String randomString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                " ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi" +
                " ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum" +
                " dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia" +
                " deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod" +
                " tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco" +
                " laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse" +
                " cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia" +
                " deserunt mollit anim id est laborum.";

        System.out.println(textToDictionary(randomString));

    }

    private static List<String> textToDictionary(String s) {
        return Stream.of(
                s.replace(".", "")
                .replace(",", "")
                .toLowerCase()
                .split(" "))
                .map(text -> text.substring(0, 1).toUpperCase() + text.substring(1))
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }
}
