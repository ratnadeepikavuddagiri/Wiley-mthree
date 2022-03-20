package generics;

class NumberClass<T extends Number> {
    T num;

    public NumberClass(T num) {
        this.num = num;
    }

    double square() {
        return num.intValue() * num.intValue();
    }
    boolean absEqual(NumberClass<?> obj){
        if(Math.abs(obj.num.intValue())==Math.abs(this.num.intValue()))
        return true;
        return false;
    }
}

public class GenericsWithExtendDemo {
    public static void main(String[] args) {
        NumberClass<Integer> obj = new NumberClass<>(3);
        System.out.println(obj.square());
        NumberClass<Double> obj1 = new NumberClass<>(-3.4);

        System.out.println( obj.absEqual(obj1));
    }
}

