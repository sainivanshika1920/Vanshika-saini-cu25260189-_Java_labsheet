import java.util.Scanner;

class Q5_EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, even = 0, odd = 0;

        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (a[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }
}