package patterns;

public class Main11 {
    public static void main(String[] args) {
        int n = 5; // You can change n to 4 or any number

        for (int i = 1; i < 2 * n; i++) {
            int blanks = i <= n ? i - 1 : 2 * n - i - 1;
            int stars = i <= n ? n - i + 1 : i - n + 1;

            // Print leading spaces
            for (int j = 1; j <= blanks; j++) {
                System.out.print(" ");
            }

            // Print stars with space between
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
