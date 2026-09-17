import java.util.Scanner;

class Q18_Search3DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][][] = new int[2][2][2];

        System.out.println("Enter 3-D array elements:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    a[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (a[i][j][k] == x) {
                        System.out.println("Element found at position: [" + i + "][" + j + "][" + k + "]");
                        found = true;
                    }
                }
            }
        }

        if (!found)
            System.out.println("Element not found");
    }
}