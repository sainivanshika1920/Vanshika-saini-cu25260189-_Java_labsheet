import java.util.Scanner;

class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if (!password.equals("1234"))
                System.out.println("Wrong password!");

        } while (!password.equals("1234"));

        System.out.println("Correct password!");
    }
}