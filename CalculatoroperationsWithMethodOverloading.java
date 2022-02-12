class CalculatorFunctions {

    int addition(int v1, int v2) {
        return v1 + v2;
    }

    int addition(int v1, int v2, int v3) {
        return addition(v1, v2) + v3;
    }

    int addition(int v1, int v2, int v3, int v4) {
        return addition(v1, v2, v3) + v4;
    }
}

public class CalculatoroperationsWithMethodOverloading {

    public static void main(String[] args) {
        CalculatorFunctions c1 = new CalculatorFunctions();
        System.out.println(c1.addition(10,20));
        System.out.println(c1.addition(10, 20, 30));
        System.out.println(c1.addition(10, 20, 30, 40));

    }
}
