package patterns;

public class Main4 {
    public static void main(String[] args) {
        int n=3;

        for (int i = 1; i <2*n; i++) {
            int colsInRows=i>n?2*n-i:i;
            for (int j = 1; j <= colsInRows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
