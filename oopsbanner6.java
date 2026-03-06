public class oopsbanner6 {

    // Method to create pattern for O
    public static String[] getOPattern() {
        return new String[]{
                String.join("", " ***** "),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", " ***** ")
        };
    }

    // Method to create pattern for P
    public static String[] getPPattern() {
        return new String[]{
                String.join("", "****** "),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", "****** "),
                String.join("", "*      "),
                String.join("", "*      "),
                String.join("", "*      ")
        };
    }

    // Method to create pattern for S
    public static String[] getSPattern() {
        return new String[]{
                String.join("", " ***** "),
                String.join("", "*     *"),
                String.join("", "*      "),
                String.join("", " ***** "),
                String.join("", "      *"),
                String.join("", "*     *"),
                String.join("", " ***** ")
        };
    }

    public static void main(String[] args) {

        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        // Loop to print OOPS banner
        for (int i = 0; i < 7; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}