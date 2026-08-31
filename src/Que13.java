import java.util.Scanner;
public class Que13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int n= sc.nextInt();

        if(n>0){
            System.out.print("No. is positive");
        }
        else if(n<0) {
            System.out.print("No. is negative");
        }
        else{
            System.out.print("No. is Zero");

        }

    }
}
