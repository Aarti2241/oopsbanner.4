import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    // Utility method to create map
    public static Map<Character, String[]> getCharacterPatterns() {
        Map<Character, String[]> map = new HashMap<>();

        // O pattern
        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // P pattern
        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        // S pattern
        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    // Utility method to print banner
    public static void printBanner(String text, Map<Character, String[]> map) {

        int rows = 5; // fixed height

        for (int i = 0; i < rows; i++) {

            StringBuilder output = new StringBuilder();

            for (int j = 0; j < text.length(); j++) {

                char ch = text.charAt(j);

                if (map.containsKey(ch)) {
                    String[] pattern = map.get(ch);
                    output.append(pattern[i]).append(" ");
                } else {
                    output.append("     "); // blank space for unknown char
                }
            }

            System.out.println(output.toString());
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> charMap = getCharacterPatterns();

        String message = "OOPS";

        printBanner(message, charMap);
    }
}