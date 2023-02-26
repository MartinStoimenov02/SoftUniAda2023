import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] triangle = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            triangle[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
            }
        }

        for (int i = 0; i <= n; i++) {
            System.out.print(triangle[n][i] + " ");
        }
    }
}
