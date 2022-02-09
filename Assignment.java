public class Assignment {
    public static void main(String[] args) {
        int result;
        result = (((8 + 2345) / 3) % 5) * 5;
        System.out.println(result);

        int r = 2345;
        r += 8;
        r /= 3;
        r %= 5;
        r *= 5;
        System.out.println(r);
    }
}
