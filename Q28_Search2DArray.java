import java.util.Scanner;

class Q28_Search2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r, c;

        System.out.print("Enter number of rows: ");
        r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter array elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == x) {
                    System.out.println("Element found at row " + (i + 1) + " and column " + (j + 1));
                    found = true;
                }
            }
        }

        if (!found)
            System.out.println("Element not found");
    }
}