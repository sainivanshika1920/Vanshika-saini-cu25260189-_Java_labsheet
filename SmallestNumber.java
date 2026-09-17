class SmallestNumber {
    public static void main(String[] args) {

        int a = 10, b = 5, c = 20, d = 8;

        int smallest = (a < b)
                ? ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d))
                : ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));

        System.out.println("Smallest = " + smallest);
    }
}