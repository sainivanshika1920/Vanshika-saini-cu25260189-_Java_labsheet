class LeftRotate {
    public static void main(String[] args) {

        int n = 10;

        int result = (n << 2) | (n >>> 30);

        System.out.println("Original number: " + n);
        System.out.println("After left rotation by 2: " + result);
    }
}