import java.util.Scanner;

public class Que11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System.out.print("Enter first number: ");
           int a = sc.nextInt();
           System.out.print("Enter second number: ");
           int b=sc.nextInt();
           System.out.print("Enter third number:" );
           int c=sc.nextInt();

           if(a>b) {
               if (a > c)
                   System.out.print(a + "is largest");
               else
                   System.out.print(b + "is largest");
           }
           else {
               if (b > c)
                   System.out.print(b + "is largest");
               else
                   System.out.print(c + "is largest");
           }
           }
    }