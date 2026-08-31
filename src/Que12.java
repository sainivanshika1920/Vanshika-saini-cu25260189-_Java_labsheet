import java.util.Scanner;
public class Que12{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year: ");
        int yr=sc.nextInt();
        if(yr%400==0||(yr%4==0 && yr%100!=0))
            System.out.print("Leap yr");
        else
            System.out.print("Not a leap year");
    }
}
