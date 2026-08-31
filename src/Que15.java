import java.util.Scanner;

public class Que15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int original = num;
        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;

        int sum = a * a * a + b * b * b + c * c * c;

        if (sum == original)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}