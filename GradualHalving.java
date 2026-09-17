import java.util.Scanner;
public class GradualHalving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double num = sc.nextDouble();
        int steps=0;
        while(num>=1.0){
            num/=2.0;
            steps++;
            System.out.printf("Step %d: Current value=%.4f\n ",steps,num);
        }
        System.out.println("Total reductions: " + steps);
        sc.close();
    }
}
