import java.util.Scanner;;
public class StoreVisitorCounter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of visitors: ");
        int visitors = scanner.nextInt();
        System.out.println("Initial Count: " + visitors);
        System.out.println("Visitors enters(postfix): " + (visitors++));
        System.out.println("Current count after  entry= " + visitors);
        System.out.println("Priority visitors enters(prefix): " + (++visitors));
        System.out.println("Visitor leaves(postfix decrement): " + (visitors--));
        System.out.println("Final visitors in store= " + visitors);
        scanner.close();
    }
}