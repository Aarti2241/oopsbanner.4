public class oopsbannerapp5 {
    /**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 * Demonstrates inline array initialization with String.join()
 */



    public static void main(String[] args) {

        // Declare and initialize String array in one statement
        String[] lines = {
            String.join(" ", "   *  ", "     *  ", "   ** ", "   ** "),
            String.join(" ", " *   * ", "  *   * ", "*     *", "**      "),
            String.join(" ", "*     * ", "*     *", "*     *", "**     "),
            String.join(" ", "*     * ", "*     *", "*     * ","**     "),
            String.join(" ", "*     * ", "*     *", "  **   ", " **     "),
            String.join(" ", "*     * ", "*     *", "*      ", "      *"),
            String.join(" ", " *   * ", "  *   * ", "*      ", "      *"),
            String.join(" ", "   *  ", "     *  ", " *       ", " ** ")
        };

        // Enhanced for loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}