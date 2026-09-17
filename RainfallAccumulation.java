import java.util.Scanner;
public class RainfallAccumulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total=0.0;
        for(int day=1; day<=7; day++){
            System.out.print("Enter rainfall for day "+day+"(mm): ");
            total+=sc.nextDouble();
            total+=sc.nextDouble();
        }
        System.out.printf("Total weekly rainfall=%.2f mm\n " , total);
        sc.close();
    }
}