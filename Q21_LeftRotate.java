import java.util.Scanner;

class Q21_LeftRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int first = a[0];

        for (int i = 0; i < n - 1; i++) {
            a[i] = a[i + 1];
        }

        a[n - 1] = first;

        System.out.println("Array after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}