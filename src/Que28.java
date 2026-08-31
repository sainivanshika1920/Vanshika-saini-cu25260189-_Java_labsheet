import java.util.Scanner;

class Que28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n >= -9 && n <= 9)
            System.out.println("Number of digits = 1");
        else if (n >= -99 && n <= 99)
            System.out.println("Number of digits = 2");
        else if (n >= -999 && n <= 999)
            System.out.println("Number of digits = 3");
        else if (n >= -9999 && n <= 9999)
            System.out.println("Number of digits = 4");
        else
            System.out.println("Number has 5 or more digits");
    }
}