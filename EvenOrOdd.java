 class EvenOrOdd {
    static void evenOrOdd(int n) {
        if (n % 2 == 1)
            System.out.println(n + " is Odd");
        else
            System.out.println(n + " is Even");
    }

    public static void main(String[] args) {
        int n = 3;
        evenOrOdd(n);
    }
}
