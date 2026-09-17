import java.util.Scanner;

class Q30_SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r, c, zero = 0, nonZero = 0;

        System.out.print("Enter number of rows: ");
        r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();

                if (a[i][j] == 0)
                    zero++;
                else
                    nonZero++;
            }
        }

        if (zero > nonZero)
            System.out.println("The matrix is a sparse matrix.");
        else
            System.out.println("The matrix is not a sparse matrix.");
    }
}