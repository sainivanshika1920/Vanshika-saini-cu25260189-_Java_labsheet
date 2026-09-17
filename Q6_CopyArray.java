import java.util.Scanner;

class Q6_CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }

        System.out.println("Copied array:");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}