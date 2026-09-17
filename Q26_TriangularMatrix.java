import java.util.Scanner;

class Q26_TriangularMatrix {
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

        System.out.println("Upper triangular matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        System.out.println("Lower triangular matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}