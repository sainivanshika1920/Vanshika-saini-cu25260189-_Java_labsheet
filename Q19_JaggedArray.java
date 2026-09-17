import java.util.Scanner;

class Q19_JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][];

        a[0] = new int[2];
        a[1] = new int[3];
        a[2] = new int[4];

        System.out.println("Enter elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Jagged array:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}