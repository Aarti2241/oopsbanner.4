public class HelloAppUC7 {
    public static void main(String[] args) {

        // Check if no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            // Join all names with ", "
            String names = String.join(", ", args);

            // Print greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}