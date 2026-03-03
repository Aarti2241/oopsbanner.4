public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create String array for 7 lines
        String[] banner = new String[7];

        banner[0] = String.join("   ",
                "   *   ",
                "   *   ",
                " *** ",
                "  ***  ");

        banner[1] = String.join("   ",
                " *   * ",
                " *   * ",
                " *   * ",
                " **      ");

        banner[2] = String.join("   ",
                " *   * ",
                " *   * ",
                " *   * ",
                " **      ");

        banner[3] = String.join("   ",
                " *   * ",
                " *   * ",
                " **  ",
                "  *    ");

        banner[4] = String.join("   ",
                " *   * ",
                " *   * ",
                " **      ",
                "     **  ");

        banner[5] = String.join("   ",
                " *   * ",
                " *   * ",
                " **      ",
                "     **  ");

        banner[6] = String.join("   ",
                "   *   ",
                "   *   ",
                " **      ",
                " **  ");

        // Enhanced for loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
