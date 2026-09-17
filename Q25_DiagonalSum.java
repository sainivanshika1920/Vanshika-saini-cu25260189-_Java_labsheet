import java.util.Scanner;

class Q25_DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter size of matrix: ");
        n = sc.nextInt();

        int a[][] = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int mainSum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            mainSum = mainSum + a[i][i];
            secondarySum = secondarySum + a[i][n - 1 - i];
        }

        System.out.println("Sum of main diagonal = " + mainSum);
        System.out.println("Sum of secondary diagonal = " + secondarySum);
    }
}