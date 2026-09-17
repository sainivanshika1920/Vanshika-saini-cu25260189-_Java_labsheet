import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check power of 4
        if (n == 1 || n == 4 || n == 16 || n == 64 || n == 256)
            System.out.println("It is a power of 4");
        else
            System.out.println("It is not a power of 4");

        // Toggle 3rd bit
        n = n ^ (1 << 2);
        System.out.println("After toggling 3rd bit: " + n);

        // Multiplication table
        for (int i = 1; i <= 20; i++) {
            int result = n * i;

            if (result % 6 == 0)
                continue;

            if (result % 48 == 0)
                break;

            System.out.println(n + " x " + i + " = " + result);
        }
    }
}