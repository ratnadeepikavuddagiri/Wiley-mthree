final class ImmutableClass{
    int a;
    int b;
    
    public ImmutableClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    int add(){
        return this.a+this.b;
    
    }
    @Override
    public String toString() {
        return "ImmutableClass [a=" + a + ", b=" + b + "]";
    }
}

public class Immutable {

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass(2,3);
        System.out.println(immutableClass.add());
        System.out.println(immutableClass);
        immutableClass.setA(4);
        System.out.println(immutableClass.getA());
        ImmutableClass immutableClass1 = new ImmutableClass(4,5);
        System.out.println(immutableClass1.add());
        System.out.println(immutableClass1);
    }    
}
