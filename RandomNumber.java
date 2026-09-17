import java.util.Random;

class RandomNumber {
    public static void main(String[] args) {
        Random r = new Random();

        while (true) {
            int num = r.nextInt(100) + 1;
            System.out.println(num);

            if (num % 7 == 0 && num % 13 == 0) {
                System.out.println("Found: " + num);
                break;
            }
        }
    }
}