/**
 * OOPS Banner App - UC7
 * Store Character Pattern in a Class using Inner Static Class
 */
public class oop {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character
         * @param pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern for a character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap p : patterns) {
            if (p.getCharacter() == ch) {
                return p.getPattern();
            }
        }
        return null;
    }

    /**
     * Method to print banner text
     */
    public static void printBanner(String text, CharacterPatternMap[] patterns) {

        StringBuilder[] bannerLines = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        for (char ch : text.toCharArray()) {

            String[] pattern = getCharacterPattern(ch, patterns);

            if (pattern != null) {
                for (int i = 0; i < 7; i++) {
                    bannerLines[i].append(pattern[i]).append("  ");
                }
            }
        }

        for (StringBuilder line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {

            new CharacterPatternMap('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }),

            new CharacterPatternMap('P', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    " ***** ",
                    "*      ",
                    "*      ",
                    "*      "
            }),

            new CharacterPatternMap('S', new String[]{
                    " ***** ",
                    "*      ",
                    "*      ",
                    " ***** ",
                    "      *",
                    "      *",
                    " ***** "
            })
        };

        printBanner("OOPS", patterns);
    }
}