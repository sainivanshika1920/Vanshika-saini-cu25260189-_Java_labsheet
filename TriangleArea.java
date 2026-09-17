import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter three sides: ");
        double a=sc.nextDouble(), b=sc.nextDouble(), c=sc.nextDouble();
        double s=(a+b+c)/2.0;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area="+area);
        sc.close();
    }
}