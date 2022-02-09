class SwapOfTwoNumbers {
    static void swapOfTwoNumbers(int num1, int num2) {
        System.out.println("Before Swapping : num1 = " + num1 + ", num2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping : num1 = " + num1 + ", num2 = " + num2);

    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        swapOfTwoNumbers(num1, num2);
    }
}
