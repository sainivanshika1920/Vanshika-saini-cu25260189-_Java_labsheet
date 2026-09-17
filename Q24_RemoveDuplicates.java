import java.util.Scanner;

class Q24_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        int k = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                b[k] = a[i];
                k++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(b[i] + " ");
        }
    }
}