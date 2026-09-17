import java.util.Scanner;
public class ValidTriangleAngles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 3 angles: ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(a>0 && b>0 && c>0 && (a+b+c==180)){
            System.out.println("Valid triangle");
        }
        else{
            System.out.println("Invalid triangle");
        }
        sc.close();
    }
}
