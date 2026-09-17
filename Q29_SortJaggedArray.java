import java.util.Scanner;

class Q29_SortJaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][];

        a[0] = new int[3];
        a[1] = new int[4];
        a[2] = new int[2];

        System.out.println("Enter elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a[i].length - 1; j++) {
                for (int k = j + 1; k < a[i].length; k++) {
                    if (a[i][j] > a[i][k]) {
                        int temp = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted jagged array:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}