import java.util.Scanner;

class Q23_SecondLargest {
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

        int largest = a[0];
        int second = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] > second && a[i] != largest) {
                second = a[i];
            }
        }

        System.out.println("Second largest element = " + second);
    }
}