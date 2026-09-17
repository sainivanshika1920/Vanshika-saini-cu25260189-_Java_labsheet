import java.util.Scanner;
public class PassingCriteria{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Theory % and Practical %: ");
        double th=sc.nextDouble(),pr=sc.nextDouble();
        double overall=(th+pr)/2;
        if(th>=40.0 && pr>=50.0 || overall>=50.0){
            System.out.println("Pass (Overall:"+overall+"%)");
        }
        else{
            System.out.println("Fail(Overall:"+overall+"%)");
        }
        sc.close();
    }
}