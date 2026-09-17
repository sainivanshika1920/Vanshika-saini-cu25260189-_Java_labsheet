class ShiftOperations {
    public static void main(String[] args) {

        int n = 16;

        // Multiplication by 4
        int multiply = n << 2;

        // Division by 4
        int divide = n >> 2;

        System.out.println("Number = " + n);
        System.out.println("After multiplication by 4 = " + multiply);
        System.out.println("After division by 4 = " + divide);
    }
}
